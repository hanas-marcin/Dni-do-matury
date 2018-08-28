package hanas.dnidomatury;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class GithubTypeConvertersTask {

    private final Gson gson = new Gson();

    public final List<Task> stringToSomeObjectList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<Task>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    public final String someObjectListToString(List<Task> someObjects) {
        Type listType = new TypeToken<List<Task>>() {}.getType();
        return gson.toJson(someObjects, listType);
    }
}