Name: Anthony Pitts
Uni: aep2195
Programming Project 2 readMe:


    This is a class to determine whether a specific credit card number is valid. It does this by checking whether
it passes these 6 specific parameters:

     1. check1() First digit must be 4
     2. check2() The fourth digit must be one greater than the fifth digit
     3. check3() The product of the first, fifth, and ninths digits must be 24
     4. check4() The sum of all digits must be evenly divisible by four
     5. check5() The sum of the first four digits must be one less than the sum of the last four digits
     6. check6() If you treat the first two digits and 7th and 8th digits as two-digit numbers, their sum must be 100
  
    If it passes these parameters, isValid() = true. If not, the first check that it fails will store isValid() = false 
and report the number of the first check it failed as the int errorCode.

                                          class credit card structure:
                                          
 --> Before any method, all instance variables are declared in the class, CreditCard. 
          The variable names and meanings are intuitive. For clarification, int firstDigit means the first digit
          of the inputted String. boolean isCardValid is true when the credit card number has not been proved invalid 
          by any one of the validy checks. int errorCode is 0 when isValid is true, and it is the number of the 
          first check that it failed when isValid is false. Lastly, String creditCardNumber is the string of the credit 
          card number that was inputted by the user, which is then parsed into integer digits later in the program.
          I defined all the instance variables at the scope of the class so that they could be accessed and used
          in the methods of the CreditCard class.
          
 --> CreditCard(String Card) is the constructor method that parses the characters in the String creditCardNumber which 
          correlate to numerical digits, into the variables firstDigit,secondDigit etc. I used the preset java class,
          Integer and method parseInt() to convert each desired character of the creditCardNumber into integers, in 
          order to conduct mathematical operations between these digits of the credit card number in the check() methods.
     
 --> check() is a mutator method that determines if the creditCardNumber is valid or not. It includes many subdivisions
            of this method that correlate which each check, such as check1() and check2() etc. Each check() method
            performs some algorithm to see whether or not the credit card number has ecah of the 6 specifications
            stated above.
            
             note: the setup of each individual check() method followed a similar structure of:
                 1. Establishing an "if" statement.
                 2. Making the condition of the if statement be both
                           a. The value in the isCardValid variable must be true, so that if the previous check() made it
                                   false, then it would skip over the rest of the checks, in order to print out
                                   the first errorCode that arose. 
                           b. AND the mathematical operation that performs the specified parameter for that particular
                                    check(). I made the comparitive operation "not equal to," so that it would allign
                                    with the if statment body that isCardValid is false and the error code
                                    is equated to that check number.
                3. If statement body always changed isCardValid to false and put the value of that check number as
                          the errorCode variable. If the "if" statement were false, these two operations would be ignored.
                          
--> isValid() is an accessor method which simply returns the value of the boolean isCardValid variable, which will be
         used in the main method of the CreditCardTester to determine the algorithm's output.
    
--> getErrorCode() is an accessor method which returns the value of the int errorCode variable, which will be printed 
         out in the main method of the CreditCarTester if isValid() is false.
                                    
          