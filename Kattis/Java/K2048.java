import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class K2048 {
    public static final int LEFT = 0;
    public static final int UP = 1;
    public static final int RIGHT = 2;
    public static final int DOWN = 3;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[4][];
        boolean isBlocked = false;
        boolean[][] isMerged = new boolean[4][4];



        for (int i = 0; i < 4; i++) {
            board[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int dir = Integer.parseInt(br.readLine());

        if (dir == LEFT) {
            for(int row = 0; row < 4; row++) {
                for(int col = 0; col < 3; col++) {
                    isBlocked = false;
                    for(int i = col + 1; i < 4; i++) {
                        if (board[row][i] == board[row][col] && board[row][col] != 0 && !isBlocked && !isMerged[row][col]) {
                            board[row][col] *= 2;
                            board[row][i] = 0;
                            isMerged[row][col] = true;
                            break;
                        } else if (board[row][i] > 0 && board[row][col] == 0 && !isBlocked){
                            board[row][col] = board[row][i];
                            board[row][i] = 0;
                            i--;
                        } else if (board[row][i] != 0) {
                            isBlocked = true;
                        }
                    }
                }
            }
        } else if (dir == RIGHT) {
            for(int row = 0; row < 4; row++) {
                for(int col = 3; col > 0; col--) {
                    isBlocked = false;
                    for(int i = col - 1; i >= 0; i--) {
                        if (board[row][i] == board[row][col] && board[row][col] != 0 && !isBlocked && !isMerged[row][col]) {
                            board[row][col] *= 2;
                            board[row][i] = 0;
                            isMerged[row][col] = true;
                            break;
                        } else if (board[row][i] > 0 && board[row][col] == 0 && !isBlocked){
                            board[row][col] = board[row][i];
                            board[row][i] = 0;
                            i++;
                        }else if (board[row][i] != 0) {
                            isBlocked = true;
                        }

                    }
                }
            }
        } else if (dir == UP) {
            for(int col = 0; col < 4; col++) {
                for(int row = 0; row < 3; row++) {
                    isBlocked = false;
                    for(int i = row + 1; i < 4; i++) {
                        if (board[i][col] == board[row][col] && board[row][col] != 0 && !isBlocked && !isMerged[row][col]) {
                            board[row][col] *= 2;
                            board[i][col] = 0;
                            isMerged[row][col] = true;
                            break;
                        } else if (board[i][col] > 0 && board[row][col] == 0 && !isBlocked){
                            board[row][col] = board[i][col];
                            board[i][col] = 0;
                            i--;
                        } else if (board[i][col] != 0) {
                            isBlocked = true;
                        }
                    }
                }
            }
        } else {
            for(int col = 0; col < 4; col++) {
                for(int row = 3; row > 0; row--) {
                    isBlocked = false;
                    for(int i = row - 1; i >= 0; i--) {

                        if (board[i][col] == board[row][col] && board[row][col] != 0 && !isBlocked && !isMerged[row][col]) {
                            board[row][col] *= 2;
                            board[i][col] = 0;
                            isMerged[row][col] = true;
                            break;
                        } else if (board[i][col] > 0 && board[row][col] == 0 && !isBlocked){
                            board[row][col] = board[i][col];
                            board[i][col] = 0;
                            i++;
                        } else if (board[i][col] != 0) {
                            isBlocked = true;
                        }
                    }
                }
            }
        }

        printBoard(board);

    }

    public static void printBoard(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
