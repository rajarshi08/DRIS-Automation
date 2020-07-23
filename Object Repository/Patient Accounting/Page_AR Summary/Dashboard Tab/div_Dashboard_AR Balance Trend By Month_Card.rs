<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Dashboard_AR Balance Trend By Month_Card</name>
   <tag></tag>
   <elementGuidId>c6178454-1337-40e2-9f32-6f47092a4746</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='tabContentDashboard']/div/div[2]/div/div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>card-body pt-0</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                                Jul/2018 - Jun/2019Jul/2019 - Jun/2020$0$10,000$20,000$30,000$40,000$50,000$60,000$70,000$80,000$90,000AR Balance Trend By Year0-9091-180181-365366+
	jQuery(function(){jQuery(&quot;#BalanceTrendChart&quot;).kendoChart({&quot;title&quot;:{&quot;text&quot;:&quot;AR Balance Trend By Month&quot;},&quot;legend&quot;:{&quot;position&quot;:&quot;top&quot;,&quot;visible&quot;:true},&quot;series&quot;:[{&quot;name&quot;:&quot;0-90&quot;,&quot;type&quot;:&quot;line&quot;,&quot;field&quot;:&quot;Balance30&quot;},{&quot;name&quot;:&quot;91-180&quot;,&quot;type&quot;:&quot;line&quot;,&quot;field&quot;:&quot;Balance60&quot;},{&quot;name&quot;:&quot;181-365&quot;,&quot;type&quot;:&quot;line&quot;,&quot;field&quot;:&quot;Balance90&quot;},{&quot;name&quot;:&quot;366+&quot;,&quot;type&quot;:&quot;line&quot;,&quot;field&quot;:&quot;Balance90Plus&quot;}],&quot;seriesDefaults&quot;:{&quot;line&quot;:{&quot;stack&quot;:true}},&quot;categoryAxis&quot;:[{&quot;labels&quot;:{&quot;rotation&quot;:-45},&quot;majorGridLines&quot;:{&quot;visible&quot;:false},&quot;field&quot;:&quot;Category&quot;}],&quot;valueAxis&quot;:[{&quot;labels&quot;:{&quot;template&quot;:&quot;#= kendo.format(\u0027{0:c0}\u0027, value) #&quot;},&quot;line&quot;:{&quot;visible&quot;:false}}],&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetBalanceByTimePeriod&quot;,&quot;data&quot;:GetTimePeriod,&quot;type&quot;:&quot;POST&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;model&quot;:{&quot;fields&quot;:{&quot;Category&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Balance30&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Balance60&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Balance90&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Balance90Plus&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null}}}}},&quot;seriesColors&quot;:[&quot;#006634&quot;,&quot;#068c35&quot;,&quot;#90cc38&quot;,&quot;#9de219&quot;],&quot;tooltip&quot;:{&quot;template&quot;:&quot;#= kendo.format(\u0027{0:c0}\u0027, value) # AR Days #= series.name #&quot;,&quot;visible&quot;:true},&quot;autoBind&quot;:true});});

                            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;tabContentDashboard&quot;)/div[@class=&quot;row&quot;]/div[@class=&quot;col-lg-6&quot;]/div[@class=&quot;card border-primary&quot;]/div[@class=&quot;card-body pt-0&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='tabContentDashboard']/div/div[2]/div/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='AR Balance By Financial Class'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='$20,000'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div/div/div[2]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
