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
