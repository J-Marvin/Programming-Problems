#include <stdio.h>
#include <string.h>

int checkSum(char strNumber[]){
    
    int j = 1;
    int i;
    int newDigit;
    int sum = 0;
    for(i = strlen(strNumber) - 1; i >= 0; i --){
        
        if(j % 2 == 0){
            newDigit = strNumber[i] - '0';
            newDigit *= 2;
            
            if(newDigit > 9)
                newDigit = newDigit / 10 + newDigit % 10;
            
            strNumber[i] = newDigit + '0';
        }   
        
        j ++;
        
        sum += strNumber[i] - '0';
    }

    return (sum % 10 == 0);
}
int main(){
    
    int num;
    int i;
    char cDump;
    char strNumber[51];
    int result[100];
    
	scanf("%d%c", &num, &cDump);

		for(i = 1; i <= num; i++){
	        scanf("%s%c", strNumber, &cDump);
	    	result[i - 1] = checkSum(strNumber);
	    }
	        
	    
	    for(i = 0; i < num; i++)
	        if(result[i] == 1)
	            printf("PASS\n");
	        else printf("FAIL\n");
    
    return 0;
}
