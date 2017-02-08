package app.com.example.android.sunshine.bean;

import java.util.List;

/**
 * Created by FJTK on 2017/2/8.
 */

public class Weather {

    /**
     * cod : 200
     * message : 0
     * city : {"geoname_id":5375480,"name":"Mountain View","lat":37.3861,"lon":-122.0839,"country":"US","iso2":"US","type":"city","population":0}
     * cnt : 7
     * list : [{"dt":1486497600,"temp":{"day":13.94,"min":13.7,"max":13.94,"night":13.7,"eve":13.94,"morn":13.94},"pressure":991.63,"humidity":100,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"speed":1.07,"deg":179,"clouds":92,"rain":10.81},{"dt":1486584000,"temp":{"day":15.43,"min":11.97,"max":16.32,"night":11.97,"eve":14.05,"morn":13.71},"pressure":994.19,"humidity":97,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"speed":2.06,"deg":165,"clouds":92,"rain":3.31},{"dt":1486670400,"temp":{"day":13.56,"min":9.42,"max":13.56,"night":9.42,"eve":12.36,"morn":12.49},"pressure":988.52,"humidity":100,"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10d"}],"speed":2.53,"deg":204,"clouds":100,"rain":32.37},{"dt":1486756800,"temp":{"day":13.02,"min":10.97,"max":13.02,"night":10.97,"eve":12.39,"morn":12.83},"pressure":1009.53,"humidity":0,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"speed":3.34,"deg":209,"clouds":81,"rain":5.62},{"dt":1486843200,"temp":{"day":10.15,"min":9.63,"max":11.94,"night":9.63,"eve":11.94,"morn":9.65},"pressure":1012.15,"humidity":0,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"speed":3.71,"deg":341,"clouds":80,"rain":1},{"dt":1486929600,"temp":{"day":11.51,"min":7,"max":13.62,"night":7.59,"eve":13.62,"morn":7},"pressure":1016.88,"humidity":0,"weather":[{"id":800,"main":"Clear","description":"sky is clear","icon":"01d"}],"speed":1.08,"deg":330,"clouds":2},{"dt":1487016000,"temp":{"day":11.07,"min":6,"max":13.35,"night":9,"eve":13.35,"morn":6},"pressure":1019.46,"humidity":0,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"speed":2.61,"deg":123,"clouds":56,"rain":0.58}]
     */

    public String cod;
    public int message;
    public CityBean city;
    public int cnt;
    public List<ListBean> list;

    public static class CityBean {
        /**
         * geoname_id : 5375480
         * name : Mountain View
         * lat : 37.3861
         * lon : -122.0839
         * country : US
         * iso2 : US
         * type : city
         * population : 0
         */

        public int geoname_id;
        public String name;
        public double lat;
        public double lon;
        public String country;
        public String iso2;
        public String type;
        public int population;
    }

    public static class ListBean {
        /**
         * dt : 1486497600
         * temp : {"day":13.94,"min":13.7,"max":13.94,"night":13.7,"eve":13.94,"morn":13.94}
         * pressure : 991.63
         * humidity : 100
         * weather : [{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}]
         * speed : 1.07
         * deg : 179
         * clouds : 92
         * rain : 10.81
         */

        public int dt;
        public TempBean temp;
        public double pressure;
        public int humidity;
        public double speed;
        public int deg;
        public int clouds;
        public double rain;
        public List<WeatherBean> weather;

        public static class TempBean {
            /**
             * day : 13.94
             * min : 13.7
             * max : 13.94
             * night : 13.7
             * eve : 13.94
             * morn : 13.94
             */

            public double day;
            public double min;
            public double max;
            public double night;
            public double eve;
            public double morn;
        }

        public static class WeatherBean {
            /**
             * id : 501
             * main : Rain
             * description : moderate rain
             * icon : 10d
             */

            public int id;
            public String main;
            public String description;
            public String icon;
        }
    }
}
