<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Dashboard_AR Balance_Card</name>
   <tag></tag>
   <elementGuidId>0cbc1daa-e993-4108-bfa3-3280788cb846</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='tabContentDashboard']/div[3]/div/div/div</value>
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
                                AR Balance
	jQuery(function(){jQuery(&quot;#workQueueChart&quot;).kendoChart({&quot;chartArea&quot;:{&quot;background&quot;:&quot;transparent&quot;},&quot;title&quot;:{&quot;text&quot;:&quot;AR Balance&quot;,&quot;position&quot;:&quot;top&quot;},&quot;legend&quot;:{&quot;visible&quot;:false},&quot;series&quot;:[{&quot;name&quot;:&quot;Balance&quot;,&quot;type&quot;:&quot;pie&quot;,&quot;field&quot;:&quot;Balance&quot;,&quot;categoryField&quot;:&quot;Category&quot;,&quot;colorField&quot;:&quot;Color&quot;,&quot;startAngle&quot;:150,&quot;labels&quot;:{&quot;background&quot;:&quot;transparent&quot;,&quot;template&quot;:&quot;#= category #: \n #= kendo.format(\u0027{0:c0}\u0027, value / 1)#&quot;,&quot;visible&quot;:true}}],&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/AccountAssignmentByDaysInAR&quot;,&quot;type&quot;:&quot;POST&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;model&quot;:{&quot;fields&quot;:{&quot;Category&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Balance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Color&quot;:{&quot;type&quot;:&quot;string&quot;}}}}},&quot;tooltip&quot;:{&quot;format&quot;:&quot;{0:C0}&quot;,&quot;visible&quot;:true}});});

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
      <value>//div[@id='tabContentDashboard']/div[3]/div/div/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Year'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='HalfYear'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='User Name'])[1]/preceding::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]/div/div/div[3]/div/div/div</value>
   </webElementXpaths>
</WebElementEntity>
