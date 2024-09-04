package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
   public boolean equal(String1 s) {
        throw new UnsupportedOperationException("equal() function is not supported yet.");
	 if (this.size != s.size) {
        return false;
    }   
        for(int i = 0; i < str.length(); i++) {
		if(str.getChar(i) != s.getChar(i))
			return false;
	}
	    return true;
    }
    public void reverse() {
        throw new UnsupportedOperationException("reverse() function is not supported yet.");
    if (size == -1) {
        return new char[0];
    }

    char[] newStr = new char[size + 1];
    int j = 0;
    for (int i = size; i >= 0; i--) {
        newStr[j++] = str[i];
    }
    return newStr;
}


}
