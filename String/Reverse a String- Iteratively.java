// Reversing a String - Iterative method

public String reverseString( String s)
{
  if(s == null)
  {
    return null;
  }
  String result = ""; // Empty string
  for(int i = s.length() -1; i >= 0; i--)
  {
    result = result + s.charAt(i);
  }
  return result;
}


// Reversing using string BUilder

public String reverseString( String s)
{
  if(s == null)
  {
    return null;
  }
  StringBuilder sb = new StringBuilder();

  for(int i = s.length() -1; i >= 0; i--)
  {
    sb = sb.append(s.charAt(i));
  }
  return sb.toString() ;
}
