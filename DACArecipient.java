/**
 * Represents one person
 * 
 * <TODO add @author info here for all group-mates!>
 **/

//TODO PART 2: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : String
+ jdnToDate(j : int) : String //Should be underlined to indicate static
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//DONE: Declare the instance variables. 
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;

  /****** CONSTANTS ******/
  private final String ASCII_ART_0 ="    .----.    .----.  ",
        ASCII_ART_1 = "   (  --  \\  /  --  )",
        ASCII_ART_2 = "          |  |        ",
        ASCII_ART_3 = "         _/  \\_      ",
        ASCII_ART_4 = "        (_    _)      ",
        ASCII_ART_5 = "     ,    `--`    ,   ",
        ASCII_ART_6 = "     \\'-.______.-'/  ",
        ASCII_ART_7 = "      \\          /   ",
        ASCII_ART_8 = "       '.--..--.'     ",
        ASCII_ART_9 = "         `\"\"\"\"\"` ",
        ASCII_CREDIT ="   ascii art by: jgs    ";

	private final String TITLE_USA = "UNITED STATES OF AMERICA",
				TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
	private final String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
				LABEL_CATEGORY = "Category", LABEL_CARD_NUM = "Card#", LABEL_BIRTH_COUNTRY = "Country of Birth",
				LABEL_TERMS_CONDITIONS = "Terms and Conditions", LABEL_BIRTH_DATE = "Date of Birth",
				LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
				LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";

	/***** MUTATORS *****/
	//DONE: Write the setter for each instance variable. Remember to include documentation for each method.
  
    public void setSurname(String surname)
    {
      this.surname = surname;
    }
    public void setGivenName(String givenName)
    {
      this.givenName = givenName;
    }
    public void setUscisNumber(String uscisNumber)
    {
      this.uscisNumber = uscisNumber;
    }
    public void setCountryOfOrigin(String countryOfOrigin)
    {
      this.countryOfOrigin = countryOfOrigin;
    }
    public void setBirthday(int birthday)
    {
      this.birthday = birthday;
    }
    public void setValidFromDate(int validFromDate)
    {
      this.validFromDate = validFromDate;
    }
    public void setExpirationDate(int expirationDate)
    {
      this.expirationDate = expirationDate;
    }
    public void setSex(char sex)
    {
      this.sex = sex;
    }
  //DONE: Write the setAll method. Remember to include documentation.
    public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
    {
      this.surname = surname;
      this.givenName = givenName;
      this.uscisNumber = uscisNumber;
      this.countryOfOrigin = countryOfOrigin;
      this.birthday = birthday;
      this.validFromDate = validFromDate;
      this.expirationDate = expirationDate;
      this.sex = sex;
    }

	/***** ACCESSORS *****/
	//DONE: Write the getter for each instance variable. Remember to include documentation for each method.
  public String getSurname()
  {
    return surname;
  }
  public String getGivenName()
  {
    return givenName;
  }
  public String getUscisNumber()
  {
    return uscisNumber;
  }
  public String getCountyOfOrigin()
  {
    return countryOfOrigin;
  }
  public int getBirthday()
  {
    return birthday;
  }
  public int getValidFromDate()
  {
    return validFromDate;
  }
  public int getExpirationDate()
  {
    return expirationDate;
  }
	public char getSex()
  {
    return sex;
  }


	/***** OTHER REQUIRED METHODS *****/
	//TODO: Write the toString, equals method, remember to include documentation for each
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }


  public boolean equals(DACArecipient other)
  {
    return (this.surname.equals(other.surname) && 
					this.givenName.equals(other.givenName) && 
					this.uscisNumber.equals(other.uscisNumber) && 
					this.countryOfOrigin.equals(other.countryOfOrigin) && 
					this.birthday == other.birthday && 
					this.validFromDate == other.validFromDate && this.expirationDate == other.expirationDate && 
					this.sex == other.sex);
  }
  

  /** DESCRIPTION: Prints to the console the Employment Authorization Card using given parameters.*/
  public String printCard()
  {
		String card;
		
    card = String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
		card += String.format("║%35s%35s║%n", TITLE_USA, "");
		card += String.format("║%60s%10s║%n", TITLE_EAC, "");
		card += String.format("║%-25s%-45S║%n", "", LABEL_SURNAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_0, surname);
		card += String.format("║%-25s%-45S║%n", ASCII_ART_1, LABEL_GIVEN_NAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_2, givenName);
		
		card += String.format("║%-25s%-45S║%n", ASCII_ART_3, LABEL_USCIS_NUM);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_4, uscisNumber);
		
		card += String.format("║%-25s%-45S║%n", ASCII_ART_5, LABEL_BIRTH_COUNTRY);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_6, countryOfOrigin);
		card += String.format("║%-25s%-15S%-30S║%n", ASCII_ART_7, LABEL_BIRTH_DATE, LABEL_SEX);
		card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, jdnToDate(birthday), sex);
		card += String.format("║%-25s%-15S%-30s║%n", ASCII_ART_9, LABEL_VALID_DATE, jdnToDate(validFromDate));
		card += String.format("║%-25s%-15S%-30s║%n", "", LABEL_EXPIRE_DATE, jdnToDate(expirationDate));
		card += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
		card += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
		return card;
  }

	/**DESCRIPTION: Converts a Julian Day Number to Julian calendar date formatted as MM/DD/YYYY using algorithm adapted from https://en.wikipedia.org/wiki/Julian_day.*/
  public static String jdnToDate(int j)
	{
		int B, C, e, f, g, h, D, M, Y;
		
		B=274277;
		C=-38;
		f=j + 1401 + (((4*j+B)/146097)*3)/4+C;
		e=4*f+3;
		g=(e%1461)/4;
		h=5*g+2;
		D=((h%153)/5)+1;
		M=((h/153)+2)%12+1;
		Y=(e/1461)-4716+(12+2-M)/12;

		return String.format("%02d/%02d/%04d",M,D,Y);

	}
	

}