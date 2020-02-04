/*
 * Copyright 2017 Andy Turner, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.web.houseprices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;
import uk.ac.leeds.ccg.generic.io.Generic_IO;
import uk.ac.leeds.ccg.web.core.Web_Object;

/**
 * Web_HousepriceLoader
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class Web_HousepriceLoader extends Web_Object {

    public TreeMap<Long, Web_HousePriceRecord> housepriceRecords;

    public Web_HousepriceLoader() {
    }

    public void scrape(String firstpartPostcode) {
        String[] args = new String[3];
        args[0] = "/nfs/see-fs-02_users/geoagdt/scratch02/zoopla/";
        args[1] = ""; //"r";
        args[2] = firstpartPostcode.toUpperCase();
        //args[3] = "7";
        new Web_ZooplaHousepriceScraper(env).run(args);
    }

    public void scrape(String firstpartPostcode, String secondpartPostcode) {
        String[] args = new String[4];
        args[0] = "/nfs/see-fs-02_users/geoagdt/scratch02/zoopla/";
        args[1] = ""; //"r";
        args[2] = firstpartPostcode.toUpperCase();
        args[3] = secondpartPostcode.toUpperCase();
        //args[3] = "7";
        new Web_ZooplaHousepriceScraper(env).run(args);
    }

    public void load(String postcode) throws IOException {
        long ID = 0L;
        housepriceRecords = new TreeMap<>();
        Path file = Paths.get("/scratch01/Work/Projects/NewEnclosures/_Houseprices_sw9.csv");
        BufferedReader br = Generic_IO.getBufferedReader(file);
        StreamTokenizer st = new StreamTokenizer(br);
        Generic_IO.setStreamTokenizerSyntax5(st);
        //String s = "'";
        st.wordChars('\'', '\'');
        st.nextToken();
        String line = st.sval;
        int token = st.nextToken();
        while (token != StreamTokenizer.TT_EOF) {
            switch (token) {
                case StreamTokenizer.TT_EOL:
                    if (line != null) {
                        Web_HousePriceRecord rec = new Web_HousePriceRecord(ID);
                        System.out.println(line);
                        rec.processLine(line);
                        housepriceRecords.put(ID, rec);
                        ID++;
                    }
                    break;
                default:
                    line = st.sval;
                    break;
            }
            //token = st.nextToken();
            token = st.nextToken();
        }
    }

}
