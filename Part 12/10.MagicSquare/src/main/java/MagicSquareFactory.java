
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int values = 1;
        int center = size / 2;
        // implement the creation of a magic square with the Siamese method algorithm here
        square.placeValue(center, 0, values);
        values++;
        int row = 0;
        int column = center;
        int iter = 1;

        while (true) {

            if (square.isMagicSquare()) {
                break;
            }
            int oldRow = row;
            int oldColumn = column;
            row -= 1;
            column += 1;

            int check = square.readValue(column, row);

            if (check == -1) {
                if (row < 0 || row >= square.getHeight()) {
                    row = square.getHeight() - 1;
                }

                if (column < 0 || column >= square.getWidth()) {
                    column = 0;
                }

                if (isOccupied(row, column, square, values)) {
                    row = oldRow;
                    column = oldColumn;

                    while (true) {
                        if (isOccupied(row, column, square, values)) {
                             row += 1;
                        } else {
                            break;
                        }
                    }
                    square.placeValue(column, row, values);
                    values++;
                } else {
                    square.placeValue(column, row, values);
                    values++;
                }
            } else if (check > 0 && check <= values) {
                row += 2;
                column -= 1;
                while (true) {
                    if (isOccupied(row, column, square, values)) {
                         row += 1;
                    } else {
                        break;
                    }
                }
                square.placeValue(column, row, values);
                values++;
            } else {
                square.placeValue(column, row, values);
                values++;
            }
            iter++;
            System.out.println(square.toString());
        }

        return square;
    }



    public boolean isOccupied(int row, int column, MagicSquare square, int values) {
        return square.readValue(column, row) > 0 && square.readValue(column, row) <= values;
    }
    
    public void printSums(MagicSquare square){
        System.out.println("Sono differenti?" + square.allNumbersDifferent());
        System.out.println("" +square.sumsAreSame());
    }
}
