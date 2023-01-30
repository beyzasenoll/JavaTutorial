public class WriteBackward {
    public String reverseString(String str)
    {
        if(str.isEmpty())
        {
            System.out.println("String is empty.");

            return str;
        }
        else
        {
            System.out.print(str.charAt(str.length()-1));
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }
}
