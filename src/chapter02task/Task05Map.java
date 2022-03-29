package chapter02_task;
import java.util.HashMap;
import java.util.Map;

public class Task05_Map {
	public static void main(String[] args) {
		Map<String, String> comics = new HashMap<String, String>();
		comics.put("Landreaall", "おがきちか");
		comics.put("虫と歌", "市川春子");
		comics.put("ほしとんで", "本田");
		comics.put("マロニエ王国と七人の騎士", "岩本ナオ");
		
		for (String key : comics.keySet()) {
			String value = comics.get(key);
			System.out.println("『" + key + "』の著者は、" + value + "です。");
		}
	}
}
