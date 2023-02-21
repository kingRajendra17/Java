public class DuplicateString {
    public static void main(String[] arg) {
        String String = "welcome to welcome to bon fire welcome";
        int count;

        String = String.toLowerCase();
        String words[]=String.split(" ");
        System.out.println("Duplicate words in a string");

        for(int i =0;i< words.length;i++) {
            count=1;
            for(int j=i+1;j< words.length;j++); {
                if (words[i].equals(words[i])) {
                    count++;
                    words[i]="0";
                }
            }
            if(count>1&&words[i]!="0")
                System.out.println(words[i]);

        }

    }
}
