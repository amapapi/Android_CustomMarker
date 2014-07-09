������Ϊ���ڸߵµ�ͼAndroid SDK���з�װ��ʵ�������ֶ����Marker��ʽ����������2012���ʡ�˿�����ṹ���ݻ���ͳ�Ʊ�ͼ����״ͼ�Լ���ʾ��ϸ��Ϣ������

##ǰ����

- [�ߵ¹ٷ���վ����key](http://id.amap.com/?ref=http%3A%2F%2Fapi.amap.com%2Fkey%2F).
- �Ķ�[�ο��ֲ�](http://api.amap.com/Public/reference/Android%20API%20v2/).
- - ���̻���3D��ͼ2.2.1�汾��[��������](https://github.com/amapapi/Android_AMap_3DMapSDK).

##Ч��ͼ���£�

 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E9%A5%BC%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E6%9F%B1%E7%8A%B6%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E4%BF%A1%E6%81%AF%E5%9B%BE.png)

 ##�汾����1.0.0 

 �ṩ�˻����ı�ͼ����״ͼ����ϸ��ʾ��Marker��ʽ�Ļ���
 
 ##������Դ��
 
* [markerlibrary.jar](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/markerlibrary.jar) (library)
* [ʵ��Ӧ��](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/ViewMarkerDemo.apk) (apk)
* ɨһɨ����Ӧ��

![Screenshot](https://raw.githubusercontent.com/qiyy/Android_CustomMarker_lib/master/resources/%E4%BA%8C%E7%BB%B4%E7%A0%81.png)
 
 ## ʹ�÷�����
 
+ 1:��ߵµ�ͼ AndroidSDK���̷�������**[���÷���](http://developer.amap.com/api/android-sdk/guide/project/)**
+  2:�ӿ�ʹ��

* ���Ʊ�ͼ�ӿ�

``` java
//��ȡ��ͼ
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createPieChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 50);
```
								
* ������״ͼ�ӿ�	

``` java							
//��ȡ��״ͼ
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createBarChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 100);
```	

* ������ϸ��Ϣͼ�ӿڣ�

``` java
	MarkerOptions markerOptions = MarkerOptionsFactory
						.createInfoWindowMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.names[i],
								ConstantUtils.contents[i], drawable,contentDrawable);	
```									
								