package com.epam.jdi.httptests.example.dto;

import com.jdiai.tools.DataClass;

public class Info extends DataClass<Info> {
    public Object args;
    public IdName headers;
    public String origin, url;
}
