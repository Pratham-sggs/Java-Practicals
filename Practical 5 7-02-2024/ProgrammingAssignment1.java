class SY2022bit045 {
    public static void main(String[] args) {
        SY2022bit045 B = new SY2022bit045();
        String[] Reg_no5 = B.fiveThousand();
        String[] Reg_no10 = B.tenThousand();
        String[] Reg_no20 = B.twentyThousand();
        String[] Reg_no50 = B.fiftyThousand();
        
        System.out.println("Approach 5k\t  \t10k\t  \t20k\t  \t50k");
        System.out.println("LE501\t " + B.timeapr1(Reg_no5) + "\t  " + B.timeapr1(Reg_no10) + "\t  " + B.timeapr1(Reg_no20) + "\t  " + B.timeapr1(Reg_no50));
        System.out.println("LE502\t " + B.timeapr2(Reg_no5) + "\t  " + B.timeapr2(Reg_no10) + "\t  " + B.timeapr2(Reg_no20) + "\t  " + B.timeapr2(Reg_no50));
        System.out.println("LE503\t " + B.timeapr3(Reg_no5) + "\t  " + B.timeapr3(Reg_no10) + "\t  " + B.timeapr3(Reg_no20) + "\t  " + B.timeapr3(Reg_no50));
        System.out.println("LE504\t " + B.timeapr4(Reg_no5) + "\t  " + B.timeapr4(Reg_no10) + "\t  " + B.timeapr4(Reg_no20) + "\t  " + B.timeapr4(Reg_no50));
        System.out.println("LE505\t " + B.timeapr5(Reg_no5) + "\t  " + B.timeapr5(Reg_no10) + "\t  " + B.timeapr5(Reg_no20) + "\t  " + B.timeapr5(Reg_no50));
    }

    public int getValidRegistrationsCountLE501(String[] registrations) {
        int validCount = 0;

        for (String Reg : registrations) {
            if (isValidRegno(Reg) && isValidID(getId(Reg)) == 1 && isValidYear(getYear(Reg)) == 1 && isValidNum1(getNum(Reg))) {
                validCount++;
            }
        }

        return validCount;
    }
    public int getValidRegistrationsCountLE502(String[] registrations) {
        int validCount = 0;

        for (String Reg : registrations) {
            if (isValidRegno(Reg) && isValidID(getId(Reg)) == 1 && isValidYear(getYear(Reg)) == 1 && isValidNum2(getNum(Reg))) {
                validCount++;
            }
        }

        return validCount;
    }
    public int getValidRegistrationsCountLE503(String[] registrations) {
        int validCount = 0;

        for (String Reg : registrations) {
            if (isValidRegno(Reg) && isValidID(getId(Reg)) == 1 && isValidYear(getYear(Reg)) == 1 && isValidNum3(getNum(Reg))) {
                validCount++;
            }
        }

        return validCount;
    }
    public int getValidRegistrationsCountLE504(String[] registrations) {
        int validCount = 0;

        for (String Reg : registrations) {
            if (isValidRegno(Reg) && isValidID(getId(Reg)) == 1 && isValidYear(getYear(Reg)) == 1 && isValidNum4(getNum(Reg))) {
                validCount++;
            }
        }

        return validCount;
    }
    public int getValidRegistrationsCountLE505(String[] registrations) {
        int validCount = 0;

        for (String Reg : registrations) {
            if (isValidRegno(Reg) && isValidID(getId(Reg)) == 1 && isValidYear(getYear(Reg)) == 1 && isValidNum5(getNum(Reg))) {
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
     public boolean isValidNum1(String k)
    {
    	int a = Integer.parseInt(k);
    	if (a >= 1 && a <= 50)
        {
            return true;
        }
        else{
        return false;
        }
    } 
    
     public boolean isValidNum2(String k)
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
    } 
    
    public boolean isValidNum3(String k)
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
    } 
    public boolean isValidNum4(String k) {
    int num = (k.charAt(0) - '0') * 100 + (k.charAt(1) - '0') * 10 + (k.charAt(2) - '0');
    if(num >= 1 && num <= 50)
        {
        return true;
        }
    return false;
    }

    public boolean isValidNum5(String k) {
        char c = k.charAt(0);
        char d = k.charAt(2);
        if(Character.digit(c,10) != 0) {
            return false;
        }
        c= k.charAt(1);
        if(0 <= Character.digit(c,10) && Character.digit(c,10) <= 4 || Character.digit(c,10) == 5 && Character.digit(d,10) == 0) {
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

    public String randomRegristrationNoGenerator() {
        int q = ((int) (System.nanoTime()) % 10);
        String k = Integer.toString(q);
        
        int w = ((int) (System.nanoTime()) % 10);
        String t = Integer.toString(w);
        
        int e = ((int) (System.nanoTime()) % 10);
        String u = Integer.toString(e);
        
        int r = ((int) (System.nanoTime()) % 10);
        String i = Integer.toString(r);
        
        String year = k + t + u + i;
        
        q = ((int) (System.nanoTime()) % 25);
        q = 97 + q;
        char l = (char) q;
        
        w = ((int) (System.nanoTime()) % 25);
        w = 97 + w;
        char b = (char) w;
        
        e = ((int) (System.nanoTime()) % 25);
        e = 97 + e;
        char m = (char) e;
        
        String branch = "" + l + b + m;
        
        w = ((int) (System.nanoTime()) % 10);
        t = Integer.toString(w);
        
        e = ((int) (System.nanoTime()) % 10);
        u = Integer.toString(e);
        
        r = ((int) (System.nanoTime()) % 10);
        i = Integer.toString(r);
        
        String serial = t + u + i;
        
        
        return year + branch + serial;
    }

    public String[] tenThousand() {
        String[] Reg_no = new String[10000];
        for (int i = 0; i < 10000; i++) {
            Reg_no[i] = randomRegristrationNoGenerator();
        }
        return Reg_no;
    }
    public String[] fiftyThousand() {
        String[] Reg_no = new String[50000];
        for (int i = 0; i < 50000; i++) {
            Reg_no[i] = randomRegristrationNoGenerator();
        }
        return Reg_no;
    }
    public String[] twentyThousand() {
        String[] Reg_no = new String[20000];
        for (int i = 0; i < 20000; i++) {
            Reg_no[i] = randomRegristrationNoGenerator();
        }
        return Reg_no;
    }
    public String[] fiveThousand() {
        String[] Reg_no = new String[5000];
        for (int i = 0; i < 5000; i++) {
            Reg_no[i] = randomRegristrationNoGenerator();
        }
        return Reg_no;
    }
    public long timeapr1(String[] Reg_no)
    {
        SY2022bit045 c = new SY2022bit045();
        long starttime = System.nanoTime();
        int count =c.getValidRegistrationsCountLE501(Reg_no);
        long endtime = System.nanoTime();
        return endtime-starttime;
    }
    public long timeapr2(String[] Reg_no)
    {
        SY2022bit045 c = new SY2022bit045();
        long starttime = System.nanoTime();
        int count =c.getValidRegistrationsCountLE502(Reg_no);
        long endtime = System.nanoTime();
        return endtime-starttime;
    }
    public long timeapr3(String[] Reg_no)
    {
        SY2022bit045 c = new SY2022bit045();
        long starttime = System.nanoTime();
        int count =c.getValidRegistrationsCountLE503(Reg_no);
        long endtime = System.nanoTime();
        return endtime-starttime;
    }
    public long timeapr4(String[] Reg_no)
    {
        SY2022bit045 c = new SY2022bit045();
        long starttime = System.nanoTime();
        int count =c.getValidRegistrationsCountLE504(Reg_no);
        long endtime = System.nanoTime();
        return endtime-starttime;
    }
    public long timeapr5(String[] Reg_no)
    {
        SY2022bit045 c = new SY2022bit045();
        long starttime = System.nanoTime();
        int count =c.getValidRegistrationsCountLE505(Reg_no);
        long endtime = System.nanoTime();
        return endtime-starttime;
    }
}

