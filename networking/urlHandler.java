import java.net.MalformedURLException; 
import java.net.URL; 
  
public class URLclass1 
{ 
    public static void main(String[] args) 
                  throws MalformedURLException 
    { 
  
        // creates a URL with string representation. 
        URL url1 = 
        new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYq" + 
                "WK26I4fT8gfth6CACg#q=harley"); 
  
        // creates a URL with a protocol,hostname,and path 
        URL url2 = new URL("http", "www.github.com"); 
  
        URL url3 = new URL("https://www.google.co.in/search?"); 
  
        // print the string representation of the URL. 
        System.out.println(url1.toString()); 
        System.out.println(url2.toString()); 
        System.out.println(); 
        System.out.println("Different components of the URL3-"); 
  
        // retrieve the protocol for the URL 
        System.out.println("Protocol:- " + url3.getProtocol()); 
  
        // retrieve the hostname of the url 
        System.out.println("Hostname:- " + url3.getHost()); 
  
        // retrieve the defalut port 
        System.out.println("Default port:- " + 
                                        url3.getDefaultPort()); 
  
        // retrieve the query part of URL 
        System.out.println("Query:- " + url3.getQuery()); 
  
        // retrive the path of URL 
        System.out.println("Path:- " + url3.getPath()); 
  
        // retrive the file name 
        System.out.println("File:- " + url3.getFile()); 
  
        // retrieve the reference 
        System.out.println("Reference:- " + url3.getRef()); 
    } 
} 
