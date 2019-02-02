//Name: Anthony Pitts
//Uni: aep2195
// This is a class to determine whether a specific credit card number passes 6 specific parameters outlined below.
// If it passes these parameters, isValid() = true. If not, isValid() = false.
public class CreditCard{
    private String creditCardNumber; //is in the form XXXX-XXXX-XXXX (14 characters)
    private boolean isCardValid = true;
    private int errorCode = 0;
    private int firstDigit;   
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;
    private int fifthDigit;
    private int sixthDigit;
    private int seventhDigit;
    private int eighthDigit;
    private int ninthDigit; 
    private int tenthDigit;
    private int eleventhDigit;
    private int twelfthDigit;   
    
    CreditCard(String card){//method which equates the input from user into variable used throughout CreditCard class.
        creditCardNumber=card;
        firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));   
        secondDigit = Integer.parseInt(creditCardNumber.substring(1,2));
        thirdDigit = Integer.parseInt(creditCardNumber.substring(2,3));
        fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
        fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));
        sixthDigit = Integer.parseInt(creditCardNumber.substring(6,7));
        seventhDigit = Integer.parseInt(creditCardNumber.substring(7,8));
        eighthDigit = Integer.parseInt(creditCardNumber.substring(8,9));
        ninthDigit = Integer.parseInt(creditCardNumber.substring(10,11)); 
        tenthDigit = Integer.parseInt(creditCardNumber.substring(11,12));
        eleventhDigit = Integer.parseInt(creditCardNumber.substring(12,13));
        twelfthDigit = Integer.parseInt(creditCardNumber.substring(13,14));  
    }    

 
    public void check(){//mutator method that determines if the creditCardNumber is valid or not
       
       check1();
       check2();
       check3();
       check4();
       check5();
       check6();        
    }

    private void check1(){// check1() First digit must be 4
        
        if (isCardValid==true && firstDigit != 4){
            isCardValid = false;
            errorCode = 1;   
    }
    }
    private void check2(){// check2() The fourth digit must be one greater than the fifth digit
        
        if (isCardValid==true && fourthDigit!=fifthDigit+1){
            isCardValid = false;
            errorCode = 2;   
        }
    }
    private void check3(){// check3() The product of the first, fifth, and ninths digits must be 24

        if (isCardValid==true && 24 != firstDigit*fifthDigit*ninthDigit){
            isCardValid = false;
            errorCode = 3;        
        }
    }
    private void check4(){// check4() The sum of all digits must be evenly divisible by four
       
        if (isCardValid==true && 0!=((firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit+sixthDigit+seventhDigit+eighthDigit+ninthDigit+tenthDigit+eleventhDigit+twelfthDigit)%4)){
            isCardValid = false;
            errorCode = 4;
        }
                  
    
    }
    private void check5(){// check5() The sum of the first four digits must be one less than the sum of the last four digits
      
        if(isCardValid==true && (firstDigit+secondDigit+thirdDigit+fourthDigit)+1 != (ninthDigit+tenthDigit+eleventhDigit+twelfthDigit)){ 
            isCardValid = false;
            errorCode = 5;     
        }
    }
    private void check6(){// check6() If you treat the first two digits and 7th and 8th digits as two-digit numbers, their sum must be 100
        int firstTwoDigits = Integer.parseInt(creditCardNumber.substring(0,2));
        int seventhAndEighthDigits = Integer.parseInt(creditCardNumber.substring(7,9));
        if (isCardValid==true && 100 != firstTwoDigits + seventhAndEighthDigits){
            isCardValid = false;
            errorCode = 6;        
    }
    }
    public boolean isValid(){//accesor method;As boolean, returns if isCardValid true or not -> true=card number is valid
        return isCardValid;
    }
    public int getErrorCode(){//accesor method that returns the value of the variable errorCode
        return errorCode;
    }
}