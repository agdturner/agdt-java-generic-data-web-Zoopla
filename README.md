# Web Zoopla

https://github.com/agdturner/agdt-java-generic-data-web-Zoopla/

A Java tool for scraping data from Zoopla. 

The website URL is: https://www.zoopla.co.uk/.

https://www.zoopla.co.uk/house-prices/ls2-9jt/

## Usages
1. Used for scraping house price paid from the Zoopla's website.

## Code status and development roadmap
This code was abstracted from the Web library on which it depends in a code rationalisation in November 2019. Modifications are needed to the way the HTML response is parsed in order to produce the data that used to be produced by running the code before changes to the way Zoopla serve out the data.

## Platform requirements
The cde has been compiled using Java 11. It may be possible to compile and run it on earlier version of the Java Standard Development Kit. 

## Dependencies
Please see the pom.xml for details.
1. Generic: https://github.com/agdturner/agdt-java-generic - A Java library with generally useful classes and methods.
2. Web: https://github.com/agdturner/agdt-java-generic-web/ - A Java library for processing data from and organising data for the World Wide Web.

## Contributions
Please raise issues and submit pull requests in the usual way. Contributions will be acknowledged.

## LICENCE
Please see the standard Apache 2.0 open source LICENCE.
