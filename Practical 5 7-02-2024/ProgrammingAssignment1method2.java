class SY2022bit045 {
    public static void main(String[] args) {
        String[] Reg_no = {"2022bit045", "2026bch192", "4044bit045", "2022bme003", "2022bcs192"};

        SY2022bit045 B = new SY2022bit045();

        System.out.println(B.getValidRegistrationsCountLE50(Reg_no));
    }

    public int getValidRegistrationsCountLE50(String[] registrations) {
        int validCount = 0;

        for (String Reg : registrations) {
            if (isValidRegno(Reg) && isValidID(getId(Reg)) == 1 && isValidYear(getYear(Reg)) == 1 && isValidNum(getNum(Reg))) {
                validCount++;
            }
        }

        return validCount;
    }

    public boolean isValidRegno(String Reg) {
        return Reg.matches("\\d{4}[a-zA-Z]{3}\\d{3}");
    }

    public String getId(String Reg) {
        return Reg.substring(4, 7);
    }

    public String getYear(String Y) {
        return Y.substring(0, 4);
    }
    public String getNum(String Y) {
        return Y.substring(7, 10);
    }
    /* public boolean isValidNum(String k)
    {
    	int a = Integer.parseInt(k);
    	if (a >= 1 && a <= 50)
        {
            return true;
        }
        else{
        return false;
        }
    } */
    
     /*public boolean isValidNum(String k)
    {
    	if(Character.getNumericValue(k.charAt(1)) <= 4 && Character.getNumericValue(k.charAt(0)) == 0)
    	{
    		return true;
    	}
    	else if (Character.getNumericValue(k.charAt(1)) == 5 && Character.getNumericValue(k.charAt(0)) == 0 && Character.getNumericValue(k.charAt(2)) == 0 )
    	{
    		return true;
    	}
    	return false;
    } */
    
    /*public boolean isValidNum(String k)
    {
        char c = k.charAt(0);
        if (c != '0') {
            return false;
        }
        c = k.charAt(1);
        char d = k.charAt(2);
        if( c=='0'||c == '1' || c == '2' || c == '3' || c == '4' || (c=='5' && d=='0'))
        {
            return true;
        }
        return false;
    } */
    /* public boolean isValidNum(String k) {
    int num = (k.charAt(0) - '0') * 100 + (k.charAt(1) - '0') * 10 + (k.charAt(2) - '0');
    if(num >= 1 && num <= 50)
        {
        return true;
        }
    return false;
    }*/
    public boolean isValidNum(String k)
    {
        char c = k.charAt(0);
        char d = k.charAt(2);
        if(Character.digit(c,10) != 0)
        {
            return false;
        }
        c= k.charAt(1);
        if(0 <= Character.digit(c,10) && Character.digit(c,10)<=4 || Character.digit(c,10)==5 && Character.digit(d,10)==0 ) 
        {
            return true;
        }
        return false;
    }

    
    public int isValidID(String S) {
        if (S.equalsIgnoreCase("bit") || S.equalsIgnoreCase("bcs") || S.equalsIgnoreCase("bch") || S.equalsIgnoreCase("bme")) {
            return 1;
        } else {
            return 0;
        }
    }

    public int isValidYear(String y) {
        int a = Integer.parseInt(y);
        if (a >= 2000 && a <= 2024)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
    
}
