������Ϊ���ڸߵµ�ͼAndroid SDK���з�װ��ʵ�������ֶ�����Marker��ʽ����������2012����ʡ�˿������ṹ���ݻ���ͳ�Ʊ�ͼ����״ͼ�Լ���ʾ��ϸ��Ϣ������
Ч��ͼ���£�
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E9%A5%BC%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E6%9F%B1%E7%8A%B6%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E4%BF%A1%E6%81%AF%E5%9B%BE.png)
<br /><h2>�汾����1.0.0</h2>
<br /> �ṩ�˻����ı�ͼ����״ͼ����ϸ��ʾ��Marker��ʽ�Ļ���
<br /> <h2>������Դ��</h2>
 <br />**[markerlibrary.jar](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/markerlibrary.jar)** (library)
 <br />**[ʵ��Ӧ��](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/ViewMarkerDemo.apk)** (apk)
 <br /> ɨһɨ����Ӧ��
 <br />![Screenshot]( https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E4%BA%8C%E7%BB%B4%E7%A0%81.png)
<br /><h2> ʹ�÷�����</h2>
<br />  1:��ߵµ�ͼ AndroidSDK���̷�������**[���÷���](http://developer.amap.com/api/android-sdk/guide/project/)**
<br />  2:�ӿ�ʹ��
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
								
