package test.example.Javapractice.ControlStatements;

//Jump Statement --	Nested loop with break: Exit inner loop when column is 2.

public class NestedLoop {


        public static void main(String[] args) {


           //Using break statement
//            for (int row = 1; row <= 3; row++) {
//                for (int col = 1; col <= 4; col++) {
//                    if (col == 2) {
//                        break; // Exit inner loop when column is 2
//                    }
//                    System.out.println("Row: " + row + ", Column: " + col);
//                }
//            }
//

            //Using continue statement

                    for (int row = 1; row <= 3; row++) {
                        for (int col = 1; col <= 4; col++) {
                            if (col == 2) {
                                continue; // Skip column 2 and move to the next column
                            }
                            System.out.println("Row: " + row + ", Column: " + col);
                        }
                    }
                }





}
