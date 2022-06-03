package COM.BRIDGELABZ;

public class AddressBookData {
    public String FIRST_NAME;
    public String LAST_NAME;
    public String EMAIL_ID;
    public long MOBILE_NUMBER;
    public String ADDRESS;

    public AddressBookData(String FIRST_NAME , String LAST_NAME , String EMAIL_ID,long MOBILE_NUMBER,String ADDRESS){
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.EMAIL_ID = EMAIL_ID;
        this.MOBILE_NUMBER = MOBILE_NUMBER;
        this.ADDRESS = ADDRESS;
    }

    public String toString(){
        return "First name = " + FIRST_NAME + "Last Name = "+ LAST_NAME + "Email id = "+EMAIL_ID + "mobile no. = "+MOBILE_NUMBER+"Address ="+ADDRESS;
    }

}


