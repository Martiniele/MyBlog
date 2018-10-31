package com.oaken.base.entity.model;

import java.util.List;

public class Province {

    /**
     * country : china
     * province : [{"name":"hu'nan","city":[{"name":"changsha"},{"name":"yongzhou"}]}]
     */

    private String country;
    private List<ProvinceBean> province;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<ProvinceBean> getProvince() {
        return province;
    }

    public void setProvince(List<ProvinceBean> province) {
        this.province = province;
    }

    public static class ProvinceBean {
        /**
         * name : hu'nan
         * city : [{"name":"changsha"},{"name":"yongzhou"}]
         */

        private String name;
        private List<CityBean> city;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<CityBean> getCity() {
            return city;
        }

        public void setCity(List<CityBean> city) {
            this.city = city;
        }

        public static class CityBean {
            /**
             * name : changsha
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
