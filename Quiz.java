public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  if(word.equals("")||word!.contains("a"||"b"||"c"||"d"||"e"||"f"||"g"||"h"||"i"||"j"||"k"||"l"||"m"||"n"||"o"||"p"||"q"||"r"||"s"||"t"||"u"||"v"||"w"||"x"||"y"||"z"))//Precondition
  {
    String currentLetter;
    for(int i; i<word.length(); i++)
    {
      if((word(i).equals("A")||word(i+1).equals("A")) && word(i+2)!.equals("A"))
      {
        currentLetter = word(i);
        word(i) = word(i+1);
        word(i+1) = currentLetter;
        i++;
      }
    }
  }
  return word;
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  String original;
  String new;

  for(int i; i>-1; i--)
  {
    if(wordList.get(i) != null)
    {
    original = wordList.get(i);
    new = wordList.get(i).scrambleWord(original);
    if(new.equals(original))
      wordList.remove().get(i);
    }
  }
}
