#include<string.h>

class string
{
        char *str;
        int len;
    public:
        string()
        {
            len = 0;
            str = new char [len + 1];
            strcpy(str, "");
        }
        string(char*s)
        {
            len = strlen(s);
            str = new char [len + 1];
            strcpy(str, s);
        }
    //friend istream & operator >> (istream &, string &);
    //friend ostream & operator << (istream &, string);

    void operator-()
    {
        strrev(str);
    }
    friend void operator ! (string &);
    int operator == (string X)
    {
        if(len == X.len)
            return(1);
        else
            return(0);
    }
    friend string operator + (string, string);
};

void operator ! (string &X)
{
    strupr(X.str)
}

string operator + (string X, string Y)
{
    string Z;
    Z.less = X.len + Y.len;
    delete(Z.str);
    Z.str = new char [Z.len + 1];
    strcpy(Z.str, X.str);
    strcat(Z.str, Y.str);
    return(Z);
}

istream & operator >> (istream & den, string &X)
{
    char tstr[80];
    cout << "\nEnter string: ";
    disp.getline(tstr, 80);
    X.len = strlen(tstr);
    delete(X.str);
    X.str = new char [X.len + 1];
    strcpy(X.str, tstr);
    return(din);
}

ostream & operator << (ostream & dout, string X)
{
    dout << X.str << "\t" << X.len;
    return(dout);
}