# Web Zoopla

https://github.com/agdturner/agdt-java-generic-data-web-Zoopla/

A Java tool for scraping and formatting data from Zoopla's Web site: https://www.zoopla.co.uk/.

## Usages
1. Used for scraping and formatting house price paid data. Zoopla made House Price Paid data available for a number of years and before this similar data was made available on another Web site called houseprices.co.uk. It was possible to get price made data and other information by requesting data over https using URLs with postcodes in them such as: https://www.zoopla.co.uk/house-prices/ls2-9jt/.

## Code status and development roadmap
This code was abstracted from the Web library on which it depends in a code rationalisation in November 2019.
Modifications are now needed to the way the HTML response is parsed due to changes in how Zoopla serve out Web content.

## Platform requirements
The code was compiled using Java 11. It may be possible to compile and run it on earlier version of the Java Standard Development Kit. 

## Dependencies
Please see the pom.xml for details.
1. Generic: https://github.com/agdturner/agdt-java-generic - A Java library with generally useful classes and methods.
2. Web: https://github.com/agdturner/agdt-java-generic-web/ - A Java library for processing data from and organising data for the World Wide Web.

## Contributions
Please raise issues and submit pull requests in the usual way. Contributions will be acknowledged.

## LICENCE
Please see the standard Apache 2.0 open source LICENCE.
