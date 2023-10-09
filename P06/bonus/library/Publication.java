// Copyright 2023 Eduardo Ramos <https://github.com/EduardoRamos585/cse1325.git>
// Copyright 2023 George F. Rice <https://github.com/prof-rice>
//
// This file is part of the Library Management System and is licensed
// under the terms of the Gnu General Public License version 3 or
// any later version, see <https://www.gnu.org/licenses/>.



package library;

import java.time.LocalDate;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


/**
 * A library resource that can be checked out by a patron.
 *
 * @author             Professor George F. Rice
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
public class Publication {
    public static final int LOAN_PERIOD = 14; // days
    
    /**
     * Creates a Publication instance.
     *
     * The year of copyright must be between 1900 and the present.
     *
     * @param title     the name of the library
     * @param author    the principal creator of this resource
     * @param copyright the year in which this publication was released or registered
     * @since              1.0
     */
    public Publication(String title, String author, int copyright) {
        if(copyright < 1900 || copyright > LocalDate.now().getYear())
            throw new IllegalArgumentException("Invalid copyright year : " + copyright);
        this.title = title;
        this.author = author;
        this.copyright = copyright;
    }
    /**
     * Notes the patron who borrowed this publication along with the due date
     *
     * The Patron is a string, with no data validation. This will require a lot
     * of discipline on the part of the libraries to make this field useful.
     *
     * @param patron    the identity of the person borrowing this publication
\     * @since              1.0
     */
    public void checkOut(Patron patron) {
        loanedTo = patron;
        dueDate = LocalDate.now().plusDays(LOAN_PERIOD);
    }
    /**
     * Notes that this publication has been returned
     *
     * @since              1.0
     */
    public void checkIn() {
        loanedTo = null;
        dueDate = null;
    }


    public Publication(BufferedReader br) throws IOException
    {
      title = br.readLine();
      author = br.readLine();
      copyright = Integer.parseInt(br.readLine());
      String checked_in = new String("checked in");
      String checked_out = new String("checked out");

      String check = br.readLine();
      

      if(check.equals(checked_in))
      {
        loanedTo = null;
        dueDate = null;
      }

      if(check.equals(checked_out))
      {

       loanedTo = new Patron(br);
       String day = br.readLine();
       String month = br.readLine();
       String year = br.readLine();
       String format = new String(year + '-' + month + '-' + day);
       dueDate = LocalDate.parse(format);
     

      
      }
      
      

   }

    public void save (BufferedWriter bw) throws IOException
    {
       bw.write( title + '\n');
       bw.write(author + '\n');
       bw.write("" + copyright + '\n');
       if(loanedTo == null)
       {
         bw.write("checked in"+ '\n');
       }
       else
       {
         bw.write("checked out" + '\n');
	 loanedTo.save(bw);
	 bw.write("" + dueDate.getDayOfMonth() + '\n');
         bw.write("" + dueDate.getMonthValue() + '\n');
         bw.write("" + dueDate.getYear()       + '\n');



       }

    }




    protected String toStringBuilder(String pre, String mid) {
        return pre + " \"" + title + "\" by " + author + ", copyright " + copyright
             + mid 
            + ((loanedTo != null) ? "\n     : loaned to " + loanedTo + " until " + dueDate
                                  : "");
    }
    /**
     * Formats the fields of the publication in human-readable form.
     *
     * @returns     the string representation of the publication
     * @since       1.0
     */
    @Override
    public String toString() {
        return toStringBuilder("Book", "");
    }
    private String title;
    private String author;
    private int copyright;
    private Patron loanedTo;
    private LocalDate dueDate;
}
