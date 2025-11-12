package academy;

/*Класс для представления ответа сервера на любой запрос.
Содержит код ответа (200 - успех, 400 - ошибка) и строку данных.*/

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
