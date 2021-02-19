# Практична робота "Створення і використання статичних методів"
## Перетворити шестизначне число, подане у десятковій системі числення у двійкову, восьмеричну та шістнадцятиричну систему (метод ```Calculate``` має повернути рядок - список чисел через кому).

### Вихідний код класу ```Calculate``` 
 ```java
package domain;

/**
 * A class that represent the exercise
 * @author legendoru
 */
public class Exercise {
    
    /**
     * Converting dec six-digit number to binary, octtal and hex
     * @param number six-digit number
     * @return string with binary, octal and hex notation
     * @throws java.lang.Exception 
     */
    public static String Calculate(int number) throws Exception{
        
        String result = "";
        
        // check length of number
        int length = (int) (Math.log10(Math.abs(number)) + 1);
        if (length!=6)  throw new Exception("Number `" + String.valueOf(number) + "` is not six-digit");
        
        // to binary
        result += Integer.toBinaryString(number) + ", ";
        // to octal
        result += Integer.toOctalString(number) + ", ";
        // to hex
        result += Integer.toHexString(number);
        
        return result;
    }
}
 ```

### Вихідний код класу ```TestResult``` 
 ```java
package test;

import domain.Exercise;

public class TestResult {

    
	public static void main(String[] args) {
        try {
            int input = 123456;
            System.out.printf("Number %d in binary, octal and hex  notation: %s.",
                              input, Exercise.Calculate(input));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
}

 ```

 ### Перевірка на різні вхідні дані
<img src="https://github.com/ppc-ntu-khpi/35---static-methods-legendoru/blob/master/images/1.png" width="100%"/>
<img src="https://github.com/ppc-ntu-khpi/35---static-methods-legendoru/blob/master/images/2.png" width="100%"/>
<img src="https://github.com/ppc-ntu-khpi/35---static-methods-legendoru/blob/master/images/3.png" width="100%"/>
