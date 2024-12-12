/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.*;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		String sCheck = sentence;
		while(true){
			if(sentence.indexOf(" ")==-1){
                if(sentence.indexOf("a")==0||sentence.indexOf("o")==0||sentence.indexOf("i")==0||sentence.indexOf("u")==0||sentence.indexOf("e")==0){
					System.out.print(sentence+"-way ");
                	break;
                }
                else{
					if(sentence.indexOf("a")==1||sentence.indexOf("o")==1||sentence.indexOf("i")==1||sentence.indexOf("u")==1||sentence.indexOf("e")==1){
						System.out.print(sentence.substring(1)+"-"+sentence.substring(0,1)+"ay ");
						break;
					}
					else{
						System.out.print(sentence.substring(2)+sentence.substring(0,2)+"ay ");
						break;
					}
			}
                
            }
            
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			if(word.indexOf("a")==0||word.indexOf("o")==0||word.indexOf("i")==0||word.indexOf("u")==0||word.indexOf("e")==0){
				System.out.print(word+"-way ");
			}
			else{
				if(word.indexOf("a")==1||word.indexOf("o")==1||word.indexOf("i")==1||word.indexOf("u")==1||word.indexOf("e")==1){
					System.out.print(word.substring(1)+"-"+word.substring(0,1)+"ay ");
				}
				else{
					System.out.print(word.substring(2)+"-"+word.substring(0,2)+"ay ");
				}
			}
			sentence=sentence.substring(space+1);
		}
		}
	}

