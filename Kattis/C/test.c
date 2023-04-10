#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();

/*
 * Complete the timeConversion function below.
 */

/*
 * Please either make the string static or allocate on the heap. For example,
 * static char str[] = "hello world";
 * return str;
 *
 * OR
 *
 * char* str = "hello world";
 * return str;
 *
 */
char* timeConversion(char* s) {
    char *militTime = malloc(sizeof(char) * 10);
    int hour;

    if(s[8] == 'P'){
        if(strncmp(s, "12", 2) == 0){
            strncpy(militTime, s, 2);
        	militTime[2] = '\0';
		}
        else{
            char hour[2];
            strncpy(hour, s, 2);
            int nHour = atoi(hour) + 12;

            militTime[0] = nHour / 10 + '0';
            militTime[1] = nHour % 10 + '0';
            militTime[2] = '\0';
        }
    }
    else{
        if(strncmp(s, "12", 2) == 0){
            strcpy(militTime, "00");
            militTime[2] = '\0';
        }
            
        else{
            strncpy(militTime, s, 2);
            militTime[2] = '\0';
        } 
    }

    strncat(militTime, &s[2], 6);
    printf("%sv", militTime);
    return militTime;
}

int main()
{
    FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

    char* s = readline();

    char* result = timeConversion(s);

    fprintf(fptr, "%s\n", result);

    fclose(fptr);

    return 0;
}

char* readline() {
    size_t alloc_length = 1024;
    size_t data_length = 0;
    char* data = malloc(alloc_length);

    while (true) {
        char* cursor = data + data_length;
        char* line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line) { break; }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') { break; }

        size_t new_length = alloc_length << 1;
        data = realloc(data, new_length);

        if (!data) { break; }

        alloc_length = new_length;
    }

    if (data[data_length - 1] == '\n') {
        data[data_length - 1] = '\0';
    }

    data = realloc(data, data_length);

    return data;
}

