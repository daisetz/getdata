package com.daimler.aftersales;

import com.daimler.aftersales.Util.DecodeUtil;

import java.util.Base64;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
public class Decode {

    public static void main(String[] args){
        String s = "ngBxfTFS+pTY8tM+Gcel7TpxChOmGRuhe9nJBmiS61/dCtRIHK7nJpgjMyvx+DsrWaLnEAkqeW/6GmMk7y/4Vy5Ty/hd124yADxwvD7rq7/yjSq47Qehrl6t5vdKQHk9uMv5Wvd+1vn0C1ql7kPRROySbdnvGzMs7xi7BHgYDHuCpK7ahGGwNC0YIBJes4glCxwsr0j9q7CRA5t1LNvUkKDTmhslCGn7Tdc57BXH/fsYKMwk6ADiHUETwR2QIVoj3VlsqZG6opplXXiOEGoTAsQtnGyG9WuYl6V8PSvK++UHj7o8RbQJ+EFTIrzgB8siiOfGpqbSkhoKizAle3CvZJVJtg9eiz7ttrWcTsvj4nQkqjDGYqnrGDyC6XmdHBEc37Gw4k1fZNpZ6OVfBNuRZlBBqV/OgvZW2WuBeZLjSpaMfBOJ80Mru5GQPpcrQsJJqSs33k/XfmIcK4gaYXIADnJUAD3BLwQIi5QwXvwdBScZ93C1TDJMsWC3tPh210R19ab33GkSlXLKF720kctO+PAIQgd0Qyg+PnJ5wF8YSPg7oM5AFyBR6m3cR2Z0mPp0OKCErpoDrOB9V5WE1/eslRyOUx9NEdZanpbWZuPay+bS+DQopX40wTuO9Vm1HZVEhzorQDsXaY6WBzXC2S9/9rsnzqU+RShbum//p04HPih2yyzYPbOlEbBmdv1stb7SpHkQYqhlYBgxmiS2T0s95O8YGs/UYffqDpdqooVklDob9mjm3KI8Qo+j+UCfz1JELZyebYZjWiGd7t2U24fesrfT6/byWC3e";
        System.out.print(DecodeUtil.decode(s));

    }
}
