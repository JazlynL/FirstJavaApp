
public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
    /*
    If the book is returned on or before the expected return date, no fine will be charged (i.e.: .

    fine = 0 ;
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .

   fine = 15 hackos *(number of late days)

If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .

  fine = 500 * (number of months lae)


If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
  fine =  10,000



   For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be .



*/
        if( y1 > y2){
        return 10000;
        }
        if(d1 > d2 && m1 == m2 && y1 ==y2){
        return (d1 - d2) * 15;
        }else if (m1 > m2 && y1 == y2 ){
        return (m1- m2) * 500;
        }else{
        return 0;
        }

        }

        }