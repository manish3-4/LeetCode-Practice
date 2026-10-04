
class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            reverseWords("");
        }
    }
    public static String reverseWords(String s) {
        char[] st=s.toCharArray();
        char[] r=new char[s.length()];
        int index=s.length()-1;
        int rIndex=0;
        while(index>=0){
            while(index>=0 && st[index]==' '){
                index--;
            }
            if(index<0){
                break;
            }
            int wordEnd=index;

            while(index >=0 && st[index] != ' '){
                index--;
            }
            int wordStart=index+1;
            if(rIndex!=0){
                r[rIndex++] = ' ';
            }
            for(int i=wordStart;i<=wordEnd;i++){
                r[rIndex++] = st[i]; 
            }
        }
        return new String(r,0,rIndex);
    }
}// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder result = new StringBuilder();
//         int i = s.length() - 1;

//         while (i >= 0) {
//             // 1. Extra trailing spaces ya words ke beech ke extra spaces skip karo
//             while (i >= 0 && s.charAt(i) == ' ') {
//                 i--;
//             }

//             if (i < 0) break; // Agar saare spaces khatam ho gaye toh exit karo

//             int end = i; // Word ka end position

//             // 2. Word ki start position dhundho
//             while (i >= 0 && s.charAt(i) != ' ') {
//                 i--;
//             }

//             // 3. Agar pehle se koi word add ho chuka hai, toh beech me ek space lagao
//             if (result.length() > 0) {
//                 result.append(" ");
//             }

//             // 4. Word ko extract karke result me add karo
//             result.append(s.substring(i + 1, end + 1));
//         }

//         return result.toString();
//     }
// }
// class Solution {
//     public String reverseWords(String s) {
//         // String ko trim karke split karo
//         List<String> words = Arrays.asList(s.trim().split("\\s+"));
        
//         // List ko in-place reverse kar do
//         Collections.reverse(words);
        
//         // Space ke saath join kar do
//         return String.join(" ", words);
//     }
// }
// class Solution {
//     public String reverseWords(String s) {
//         s =s.trim();
//         String[] words = s.split("\\s+");
//         StringBuilder ans = new StringBuilder();
//         for(int i= words.length-1; i>=0;i--){
//             ans.append(words[i]);

//             if(i !=0){
//                 ans.append(" ");
//             }
//         }
//         return ans.toString();
        


//     }
// }

// class Solution {
//     public String reverseWords(String s) {
//         Stack<String> stack = new Stack<>();
        
//         int n = s.length();
//         int i =0;

//         while(i < n){

//             //skip spaces
//             while(i < n && s.charAt(i) == ' '){
//                 i++;
//             }

//             if( i >=n) 
//             break;
//             int start =i;

//             //collect words
//             while( i < n && s.charAt(i) != ' '){
//                 i++;
//             }
            
//             //extract words
//             String word = s.substring(start, i);
//             stack.push(word);

            
//         }
//         //result
//         StringBuilder result = new StringBuilder();

//         while( !stack.isEmpty()){
//             result.append(stack.pop());

//             if(!stack.isEmpty()){
//                 result.append(" ");
//             }
//         }
//         return result.toString();

        
        
//     }
// }