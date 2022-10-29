package HashMap;

import java.util.HashMap;

public class Champion {
    private HashMap<String,WorldCup> champion;
    public Champion(HashMap<String,WorldCup> champion) {
        this.champion = champion;
    }
    public Champion() {}
    public HashMap<String,WorldCup> getChampion() {
        return champion;
    }
    public void setChampion(HashMap<String,WorldCup> champion) {
        this.champion = champion;
    }
    public HashMap<String,WorldCup> createChampion(){
        champion = new HashMap<String,WorldCup>();
        champion.put("1930",new WorldCup("第1届","乌拉圭","乌拉圭"));
        champion.put("1934",new WorldCup("第2届","意大利","意大利"));
        champion.put("1938",new WorldCup("第3届","法国","意大利"));
        champion.put("1950",new WorldCup("第4届","巴西","乌拉圭"));
        champion.put("1954",new WorldCup("第5届","瑞士","西德"));
        champion.put("1958",new WorldCup("第6届","瑞典","巴西"));
        champion.put("1962",new WorldCup("第7届","智利","巴西"));
        champion.put("1966",new WorldCup("第8届","英格兰","英格兰"));
        champion.put("1970",new WorldCup("第9届","墨西哥","巴西"));
        champion.put("1974",new WorldCup("第10届","前西德","西德"));
        champion.put("1978",new WorldCup("第11届","阿根廷","阿根廷"));
        champion.put("1982",new WorldCup("第12届","西班牙","意大利"));
        champion.put("1986",new WorldCup("第13届","墨西哥","阿根廷"));
        champion.put("1990",new WorldCup("第14届","意大利","西德"));
        champion.put("1994",new WorldCup("第15届","美国","巴西"));
        champion.put("1998",new WorldCup("第16届","法国","法国"));
        champion.put("2002",new WorldCup("第17届","韩日","巴西"));
        champion.put("2006",new WorldCup("第18届","德国","意大利"));
        champion.put("2010",new WorldCup("第19届","南非","阿根廷"));
        champion.put("2014",new WorldCup("第20届","巴西","德国"));
        champion.put("2018",new WorldCup("第21届","俄罗斯","法国"));
        return champion;}
    //添加冠军
    public HashMap<String,WorldCup> addChampion(String year,WorldCup worldCup){
        champion.put(year, worldCup);
        return champion;
    }
}
