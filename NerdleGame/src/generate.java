import java.util.Random; 

public class generate {
    static Random randomGenerator = new Random();
    static String operators = "+-*/()";
    static int opeatorStringLength = operators.length();
    
    public static String generate_op () {
		Random randOpObj = new Random();
		int random_op = randOpObj.nextInt(4);
		String op = new String(); 
		
		switch(random_op) {
		case 0:
			op = "+";
			break;
		case 1:
			op = "-";
			break;
		case 2:
			op = "*";
			break;
		case 3:
			op = "/";
			break;
			default:
		}
		
		return op;
    	
    }

    public static int oneOrtwo(){											//  1 MÝ 2 MÝ OPERATOR OLACAÐI SEÇÝLÝR
        Random random = new Random();
        int num =  random.nextInt(4 - 2) + 2;
        return num;
    }
    
    public static int generate_num2(){
        Random random = new Random();										// 0 ÝLE 100 ARASINDAN BÝR SAYI SEÇÝLÝR
        int num =  random.nextInt(100 - 1) + 1;
        return num;
    }
    
    
    public static boolean divide_control(int num1 , int num2) {
		float result_tmp = (float)num1 / (float)num2;
		int result = (int)result_tmp;

		if(result == 0 || result_tmp != result)								//  BÖLÜNME DURUMUNDA SAYININ 0 A BÖLÜNMEYE ÇALIÞILIP ÇALIÞILMADIÐINI 
			return false;													//  KONTROL EDER
		
		return true;
    }
    
    
    public static String two_op_equation(){
    	int num1, num2 , result = -1;
    	float result_tmp = -1;
    	String op = new String();
    	String equation = new String();
    	equation = "";
    	boolean flag = true , flag2 = true;

  	  																			// 1 OPERATORLU ÝÞLEMLER  GELEN OPERATÖRE GÖRE ÝÞLEM YAPILIR
    	while(flag) {
        	num1 = generate_num2();
        	num2 = generate_num2();
        	op = generate_op();
    		
        	if(op.equals("+")) {
    			result_tmp = num1 + num2;
    			result = (int) result_tmp;
    			flag2 = true;
    			flag = true;
    		}
    		
    		else if(op.equals("-")) {
    			result_tmp = num1 - num2;
    			result = (int) result_tmp;
    			flag2 = true;
    			flag = true;
    		}
    		else if(op.equals("*")) {
    			result_tmp = num1 * num2;		
    			result = (int) result_tmp;  
    			flag2 = true;
    			flag = true;
    		}
    		else if(op.equals("/")) {
    			result_tmp = (float)num1 / (float)num2;
    			result = (int) result_tmp; 
    			flag2 = true;
    			flag = true;
    			if(result == 0 || (result != result_tmp)) {
    				flag2 = false;
    				equation = num1 + op + num2 + "=" + result;
    			}
    				
    		}	
        	
        	if(flag2) {
        	equation = num1 + op + num2 + "=" + result;
        	if(equation.length() > 6 & equation.length() < 10 & result > 0)
        		flag = false;	
        	}

    	}
    	
		return equation;
    }
    
    
    public static String three_op_equations() {
    	int num1, num2 ,num3 , result = -1;
    	float result_tmp = -1;
    	float preResult = -1;									//	2 OPERATORLU ÝÞLEMLER OPERATORE GORE ÖNCELÝK BELÝRLENÝR
    	String op1 = new String();
    	String op2 = new String();
    	String equation = new String();
    	equation = "";
    	boolean flag = true , flag_divide = true;
    	
    	
    	while(flag) {
	    	num1 = generate_num2();
	    	num2 = generate_num2();
	    	num3 = generate_num2();

	    	op1 = generate_op();
	    	op2 = generate_op();
	    	flag = true;
	    	flag_divide = true;		
	    	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////		    	
	    	
	    	
	    	if(op1.equals("+")) {                        // ÝLK ELEMAN + ÝSE DÝGER OPERAND KONTROL EDÝLÝR
	    		
	    		
	    		if(op2.equals("+")) {
	    			
	    			result = num1 + num2 + num3;
	    			
	    		}
	    		else if(op2.equals("-")) {
	    			
	    			result = num1 + num2 - num3;
	    			
	    		}
	    		else if(op2.equals("*")) {
	    			
	    			result = num1 + num2 * num3;
	    			
	    		}
	    		else if(op2.equals("/")) {
	    			
	    			if(divide_control(num2,num3)) {
	    				result = num1 + num2 / num3;
	    				flag_divide = true;
	    			}
	    			else {
	    				flag_divide = false;
	    			}
	    			
	    		}
	    	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////		    	
	    	
	    	else if(op1.equals("-")) {                                       // ÝLK ELEMAN - ÝSE DÝGER OPERAND KONTROL EDÝLÝR
	
	    		
	    		if(op2.equals("+")) {
	    			
	    			result = num1 - num2 + num3;
	    		}
	    		else if(op2.equals("-")) {
	    			result = num1 - num2 - num3;
	    		}
	    		else if(op2.equals("*")) {
	    			result = num1 - num2 * num3;
	    		}
	    		else if(op2.equals("/")) {
	    			if(divide_control(num2,num3)) {
	    				result = num1 - num2 / num3;
	    				flag_divide = true;
	    			}
	    			else {
	    				flag_divide = false;
	    			}
	    			
	    		}
	    	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////	    	
	    	else if(op1.equals("*")) {
	    																// ÝLK ELEMAN ÇARPI ÝSE DÝREK ÇARPILIR VE 3. ELEMANA BAKILIP ÝÞLEM YAPILIR
	    		preResult = num1 * num2;
	    		
	    		if(op2.equals("+")) {
	    			
	    			result = (int)preResult + num3;
	    			
	    		}
	    		else if(op2.equals("-")) {
	    			
	    			result = (int)preResult - num3;

	    		}
	    		else if(op2.equals("*")) {
	    			
	    			result = (int)preResult * num3;

	    		}
	    		else if(op2.equals("/")) {
	    			
	    			if(divide_control((int)preResult,num3)) {
	    				result = (int)preResult / num3;
	    				flag_divide = true;
	    			}
	    			
	    			else {
	    				flag_divide = false;
	    			}
	    		}
	    		
	    	}
	    	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////		    				
	    	
	    	else if(op1.equals("/")) {										// ÝLK ELEMAN BÖLÜ ÝSE DÝREK BÖLÜNÜR VE 3. ELEMANA BAKILIP ÝÞLEM YAPILIR
	    		
	    		if(divide_control(num1,num2)) {
	    			preResult = num1 / num2;
	    			flag_divide = true;
	    		}

	    		else
	    			flag_divide = false;
	    		
	    		if(flag_divide) {
	    			
	    			if(op2.equals("+")) {
		    			
		    			result = (int)preResult + num3;
		    			
		    		}
		    		else if(op2.equals("-")) {
		    			
		    			result = (int)preResult - num3;
		    			
		    		}
		    		else if(op2.equals("*")) {
		    			
		    			result = (int)preResult * num3;
		    			
		    		}
		    		else if(op2.equals("/")) {
		    			
		    			if(divide_control((int)preResult,num3)) {
		    				result = (int)preResult / num3;
		    				flag_divide = true;
		    			}
		    			else 
		    				flag_divide = false;
		    		}
	    		}
	    	  		
	    		
	    	}
	    	
	    	
	    	if(flag_divide) {												// OLUÞTURULAN DENKLEMÝN UZUNLUÐU 7-8-9 ÝSE DÖNGÜDEN ÇIKAR , FAZLA YA DA EKSÝK
	    	equation = num1 + op1 + num2 + op2 + num3+ "=" + result;		// ÝSE TEKRARDAN OLUÞTURULUR
	    	if(equation.length() > 6 & equation.length() < 10 & result > 0)
	    		flag = false;	
	    	}
    	
    	}

    	return equation;
    }
    
   
    
    public static String generateEquations(){
    	
    	if(oneOrtwo() == 2)
    		return two_op_equation();
    	else 														//RASTGELE GELEN DEÐERE GÖRE 1 YA DA 2 OPERATÖRLÜ DENKLEM OLUÞTURUR
    		return three_op_equations();
    }
    
    
	public static void main(String[] args) {
		
		System.out.println(generateEquations());
	}
	
	
	public static boolean isOperator(char x) {
		if(x == '+' || x == '-' || x == '*' || x == '/' )
			return true;
		else 
			return false;
	}
}
