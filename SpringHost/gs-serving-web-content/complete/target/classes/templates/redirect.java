package com.example.servingwebcontent;

import java.awt.Desktop;
import java.net.URI;

public class redirect {
    
public static void main (String args[]) throws Exception
{
Desktop d = Desktop.getDesktop();
d.browse(new URI("www.google.com"));
}
}