/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 *************************************************************************/
public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {
        
        // WRITE YOUR CODE HERE
        listOfPatients = null;
        survivabilityByAge = null; 
        survivabilityByCause = null;

    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {

        // WRITE YOUR CODE HERE
        if (arrayIndex >= listOfPatients.length) {
            //StdOut.println("it worked 1");
            return -1;
        } else {
            listOfPatients[arrayIndex] = p;
            return 0;
        }

    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {

        // WRITE YOUR CODE HERE
        int numberofPatients = 0;
        listOfPatients = new Person[numberOfLines];
        for( int i = 0; i < numberOfLines; i++) {
            //new1 = StdIn.readInt();
            int i2 = StdIn.readInt();
            int e = StdIn.readInt();
            int g = StdIn.readInt();
            int a = StdIn.readInt();
            int c = StdIn.readInt();
            int u = StdIn.readInt();
            int s = StdIn.readInt();
            Person newperson = new Person(i2, e, g, a, c, u, s);
            //listOfPatients[i] = newperson;
            if (addPerson(newperson, i) == 0) {
                listOfPatients[i] = newperson;
                numberofPatients++;
            }
        }
        return numberofPatients;


    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {

        // WRITE YOUR CODE HERE
        int numSurv = 0;
        survivabilityByAge = new SurvivabilityByAge[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            int a = StdIn.readInt();
            int y = StdIn.readInt();
            double r = StdIn.readDouble();
            SurvivabilityByAge news = new SurvivabilityByAge(a, y, r);
            survivabilityByAge[i] = news;
            numSurv++;
        }
        return numSurv;


    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {

        // WRITE YOUR CODE HERE
        int numC = 0;
        survivabilityByCause = new SurvivabilityByCause[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            int c = StdIn.readInt();
            int y = StdIn.readInt();
            double r = StdIn.readDouble();
            SurvivabilityByCause news = new SurvivabilityByCause(c, y, r);
            survivabilityByCause[i] = news;
            numC++;
        }
        return numC;
    }
    
    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {

        // WRITE YOUR CODE HERE
        int count = 0;
        for ( int i = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getAge() > age) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            Person[] newA = new Person[count];
            int j = 0;
            for ( int i = 0; i < listOfPatients.length; i++) {
                if (listOfPatients[i].getAge() > age) {
                    newA[j] = listOfPatients[i];
                    j++;
                }
            }
            return newA;
        }
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {

        // WRITE YOUR CODE HERE
        int count = 0; 
        for ( int i = 0; i < listOfPatients.length; i++){
            if (listOfPatients[i].getStateOfHealth() == state) {
                count++;
            }
        } 
        if (count == 0) {
            return null;
        } else {
            Person[] newSH = new Person[count];
            int j = 0;
            for ( int i = 0; i < listOfPatients.length; i++) {
                if (listOfPatients[i].getStateOfHealth() == state) {
                    newSH[j] = listOfPatients[i];
                    j++;
                }
            }
            return newSH;
        }
    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {

        // WRITE YOUR CODE HERE
        int count = 0;
        for (int i = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getCause() == cause) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            Person[] newC = new Person[count];
            int j = 0; 
            for (int i = 0; i < listOfPatients.length; i++) {
                if (listOfPatients[i].getCause() == cause) {
                    newC[j] = listOfPatients[i];
                    j++;
                }
            }
            return newC;
        }
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {

        // WRITE YOUR CODE HERE
        Person[] hearts = new Person[numberOfHearts];
        if ( numberOfHearts > listOfPatients.length) {
            for (int i = 0; i < listOfPatients.length; i++) {
                hearts[i] = listOfPatients[i];
            }
            return hearts;
        }

        int count = 0;
        int j = 0;
        for (int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getAge() > 0 && listOfPatients[i].getAge() <= 70) {
                count++;
            }
        }

        Person[] he = new Person[count];
        for(int i =0; i < he.length; i++){
            if(listOfPatients[i].getAge() > 0 && listOfPatients[i].getAge() <= 70) {
                he[j] = listOfPatients[i];
                j++;
            }
        }

        int m = 0;
        if (count < numberOfHearts) {
            for(int i = 0; i < listOfPatients.length; i++){
                if(listOfPatients[i].getAge() > 0 && listOfPatients[i].getAge() <= 70) {
                    hearts[m] = listOfPatients[i];
                    m++;
                }
            }
            Person x = hearts[0];
            int p = 0;
            for(int i = 1; i < hearts.length; i++) {
                if (hearts[i] < x) {
                    x = hearts[i];
                    hearts[p] = x;
                    p++;
                }
            }
            for ( Person e : hearts) {
                StdOut.println("HERE");
                StdOut.println(e);
            }
            return hearts;
        } else {
            for(int i = 0; i < numberOfHearts; i++) {
                hearts[i] = he[i];
            }
            return hearts;
        }

    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }

        ht.match(5);

    }
}
