//1108. Defanging an IP Address
//Bruteforce approach

public class DefangingIP {
        public static String defangIPaddr(String address) {
            String defangedAddress = ""; 
            for(int i = 0; i < address.length(); i++)
        {
           char c = address.charAt(i);
           if(c == '.')
           {
               defangedAddress += "[.]";
           }
           else
           {
               defangedAddress += c; 
           }
        }
        return defangedAddress;      
        }
        public static void main(String[] args)
            {
                String str = "255.100.50.0";          
                System.out.println(defangIPaddr(str));
            }
    
}
