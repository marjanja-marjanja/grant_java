package academy.server;

/*Класс для представления ответа сервера на любой запрос.*/

public class ServerResponse {
    private final int responseCode;
    private final String responseData;

    public ServerResponse(int responseCode, String responseData) {
        this.responseCode = responseCode;
        this.responseData = responseData;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseData() {
        return responseData;
    }
}
