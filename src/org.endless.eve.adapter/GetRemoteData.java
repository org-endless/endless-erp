public class GetRemoteData {
    public static final GetRemoteData instance = new GetRemoteData();
    public Map<String,Object> getRemoteMap(String url){
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> formEntity = new HttpEntity<MultiValueMap<String, String>>(map,headers);
        String result = restTemplate.postForEntity(url, formEntity, String.class).getBody();
        //将json映射为Map
        Map<String, Object> mapData = MapJsonUtil.jsonToMap(result);
        System.out.println("远程调用返回结果大小:" + mapData.size());
        return mapData;
    }
}
