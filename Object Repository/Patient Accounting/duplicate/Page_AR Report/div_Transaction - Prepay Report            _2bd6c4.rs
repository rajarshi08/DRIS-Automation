<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Transaction - Prepay Report            _2bd6c4</name>
   <tag></tag>
   <elementGuidId>f17dd32b-36ba-410d-97b2-d000204940d4</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='page']/div[2]/div[2]</value>
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
      <value>col pl-0</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
                


    
        Transaction - Prepay Report
    
    
        
            End Date
            
                select
	jQuery(function(){jQuery(&quot;#PrepayTrEndDate&quot;).kendoDatePicker({&quot;change&quot;:UpdatePrepayExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            
                
            
        
    



    Transaction - Prepay Report ResultsExportGuarantor IDLast Bill DateLast PaymentBalance3452344/25/20205/1/2020($22.00)2357905/3/20204/28/2020($16.00)4345894/27/20204/26/2020($10.00)seek-warrow-w11arrow-eseek-e15select152550100500items per page1 - 3 of 3 items
	jQuery(function(){jQuery(&quot;#PrepayTransactionReport&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;columns&quot;:[{&quot;title&quot;:&quot;Guarantor ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorID&quot;,&quot;data-title&quot;:&quot;Guarantor ID&quot;},&quot;field&quot;:&quot;GuarantorID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Last Bill Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;LastBillDate&quot;,&quot;data-title&quot;:&quot;Last Bill Date&quot;},&quot;field&quot;:&quot;LastBillDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Last Payment&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;LastPayment&quot;,&quot;data-title&quot;:&quot;Last Payment&quot;},&quot;field&quot;:&quot;LastPayment&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Balance&quot;,&quot;data-title&quot;:&quot;Balance&quot;},&quot;field&quot;:&quot;Balance&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendprepaytransactionData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/PrepayTransactionSummaryReport_read&quot;,&quot;data&quot;:additionalPrepayInfo},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;Balance&quot;,&quot;dir&quot;:&quot;asc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;GuarantorID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ResponsibleParty&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastBillDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;LastPayment&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Balance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UnpostedPayment&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Provider&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DRISCreatedDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;DRISCreatedBy&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;}}}}}});});





    function additionalPrepayInfo() {

        return {
            //startdate : $(&quot;#PrepayTrStartDate&quot;).val(),
            enddate: $(&quot;#PrepayTrEndDate&quot;).val(),
        }
    }

    function UpdatePrepayGridSource() {
        $(&quot;#Result1&quot;).hide();
        $(&quot;#Result1&quot;).show();
        $('#PrepayTransactionReport').data('kendoGrid').dataSource.read();
        //$('#PrepayTransactionReport').data('kendoGrid').refresh();
    }

    function UpdatePrepayExportLink() {
        $(&quot;#ExportPrepayButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportPrepayTransactions' + '?enddate=' + encodeURIComponent($(&quot;#PrepayTrEndDate&quot;).val()));
    }

    function sendprepaytransactionData(_data) {
        var grid = $(&quot;#PrepayTransactionReport&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#PrepayTrEndDate&quot;).val();
        url = '/DRISDEV/PatientAccounting/ExportPrepayTransactions';

        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;
    }



            
            
                


    
        Transaction - Transaction Report
    
    
        
            Post Start Date
            
                select
	jQuery(function(){jQuery(&quot;#TrStartDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateTransactionExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            Post End Date
            
                select
	jQuery(function(){jQuery(&quot;#TrEndDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateTransactionExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            
                
            
        
    


    Transaction - Transaction Report ResultsExportIDSystemGroupMRNLast NameFirst NameGuarantor Last NameGuarantor First NameAccount NumberInvoice NumberPost DateReference NumberPerforming DoctorReferring DoctorDepartmentDivisionFacilityPOSProcess CodePaycode DescriptionCurrent PlanAmountPayment TypeCheck NumberAgencyTransaction Typeseek-warrow-w00arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#TransactionReport&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;columns&quot;:[{&quot;title&quot;:&quot;ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ID&quot;,&quot;data-title&quot;:&quot;ID&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;MRN&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;MRN&quot;,&quot;data-title&quot;:&quot;MRN&quot;},&quot;field&quot;:&quot;MRN&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Last Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientLastName&quot;,&quot;data-title&quot;:&quot;Last Name&quot;},&quot;field&quot;:&quot;PatientLastName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;First Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientFirstName&quot;,&quot;data-title&quot;:&quot;First Name&quot;},&quot;field&quot;:&quot;PatientFirstName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Last Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GurantorLastName&quot;,&quot;data-title&quot;:&quot;Guarantor Last Name&quot;},&quot;field&quot;:&quot;GurantorLastName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor First Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GurantorFirstName&quot;,&quot;data-title&quot;:&quot;Guarantor First Name&quot;},&quot;field&quot;:&quot;GurantorFirstName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Post Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostDate&quot;,&quot;data-title&quot;:&quot;Post Date&quot;},&quot;field&quot;:&quot;PostDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Reference Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ReferenceNumber&quot;,&quot;data-title&quot;:&quot;Reference Number&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ReferenceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Performing Doctor&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PerformingDoctor&quot;,&quot;data-title&quot;:&quot;Performing Doctor&quot;},&quot;field&quot;:&quot;PerformingDoctor&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Referring Doctor&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ReferringDoctor&quot;,&quot;data-title&quot;:&quot;Referring Doctor&quot;},&quot;field&quot;:&quot;ReferringDoctor&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Department&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Department&quot;,&quot;data-title&quot;:&quot;Department&quot;},&quot;field&quot;:&quot;Department&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Division&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Division&quot;,&quot;data-title&quot;:&quot;Division&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Division&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;POS&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;POS&quot;,&quot;data-title&quot;:&quot;POS&quot;},&quot;field&quot;:&quot;POS&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Process Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ProcessCode&quot;,&quot;data-title&quot;:&quot;Process Code&quot;},&quot;field&quot;:&quot;ProcessCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Paycode Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Description&quot;,&quot;data-title&quot;:&quot;Paycode Description&quot;},&quot;field&quot;:&quot;Description&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Payment Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PaymentType&quot;,&quot;data-title&quot;:&quot;Payment Type&quot;},&quot;field&quot;:&quot;PaymentType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Check Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CheckNumber&quot;,&quot;data-title&quot;:&quot;Check Number&quot;},&quot;field&quot;:&quot;CheckNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Agency&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Agency&quot;,&quot;data-title&quot;:&quot;Agency&quot;},&quot;field&quot;:&quot;Agency&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Transaction Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionType&quot;,&quot;data-title&quot;:&quot;Transaction Type&quot;},&quot;field&quot;:&quot;TransactionType&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendtransactionData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/TransactionSummaryReport_read&quot;,&quot;data&quot;:transAdditionalInfo},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;PostDate&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientLastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientFirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GurantorFirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GurantorLastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ReferenceNumber&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PerformingDoctor&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ReferringDoctor&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ProcessCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Balance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CurrentBalance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CPTCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Modifiers&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PaymentType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CheckNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Agency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BatchAgency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;BatchFacility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BatchNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;AdjustmentDescription&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});






    $(document).ready(function () {

       // UpdateGridSource();

    });

        function transAdditionalInfo() {
            //debugger;
            return {
                startdate : $(&quot;#TrStartDate&quot;).val(),
                enddate : $(&quot;#TrEndDate&quot;).val(),
            }
    }



    function UpdateTransactionGridSource()
        {
        $(&quot;#Results3&quot;).hide();
        $(&quot;#Results3&quot;).show();
        //debugger;
        //$('#TransactionReport').data('kendoGrid').dataSource.read.data = transAdditionalInfo();
        $('#TransactionReport').data('kendoGrid').dataSource.read();
        //$('#TransactionReport').data('kendoGrid').refresh();
    }


    function UpdateTransactionExportLink() {
        $(&quot;#ExportTransactionsButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportTransactionSummary' + '?enddate=' + encodeURIComponent($(&quot;#TrEndDate&quot;).val()) + '&amp;startdate=' + encodeURIComponent($(&quot;#TrStartDate&quot;).val()));
    }
     function sendtransactionData(_data) {    
         var grid = $(&quot;#TransactionReport&quot;).data(&quot;kendoGrid&quot;),
             parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#TrStartDate&quot;).val();
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#TrEndDate&quot;).val();
            url = '/DRISDEV/PatientAccounting/ExportTransactionSummary';


        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
         }
         window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue;

    }



            
            
                

    
        Transaction - Adjustment Report
    
    
        
            Select Start Date
            
                select
	jQuery(function(){jQuery(&quot;#TrStartDt&quot;).kendoDatePicker({&quot;change&quot;:UpdateAdjustmentExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                
            
            Select End Date
            
                select
	jQuery(function(){jQuery(&quot;#TrEndDt&quot;).kendoDatePicker({&quot;change&quot;:UpdateAdjustmentExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            
                
            
            
                
            
        
    
    

    
        Generate ReportExportSystemGroupPatient NameInvoice #LocationPatient TypeStatusPlanADJ CodeDescriptionService DateAmountPost DateBatchFacility LocationPayment TypeCheck NumberAgencyseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#AdjustmentReport&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:AdjustmentDetailGridDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice #&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;VisitID&quot;,&quot;data-title&quot;:&quot;Invoice #&quot;},&quot;field&quot;:&quot;VisitID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;RevOrg&quot;,&quot;data-title&quot;:&quot;Location&quot;},&quot;field&quot;:&quot;RevOrg&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Status&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Status&quot;,&quot;data-title&quot;:&quot;Status&quot;},&quot;field&quot;:&quot;Status&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Plan&quot;,&quot;data-title&quot;:&quot;Plan&quot;},&quot;field&quot;:&quot;Plan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;ADJ Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdjCode&quot;,&quot;data-title&quot;:&quot;ADJ Code&quot;},&quot;field&quot;:&quot;AdjCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Description&quot;,&quot;data-title&quot;:&quot;Description&quot;},&quot;field&quot;:&quot;Description&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceDate&quot;,&quot;data-title&quot;:&quot;Service Date&quot;},&quot;field&quot;:&quot;ServiceDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Post Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostDate&quot;,&quot;data-title&quot;:&quot;Post Date&quot;},&quot;field&quot;:&quot;PostDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Batch&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BatchHeader&quot;,&quot;data-title&quot;:&quot;Batch&quot;},&quot;field&quot;:&quot;BatchHeader&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostingOrganization&quot;,&quot;data-title&quot;:&quot;Facility Location&quot;},&quot;field&quot;:&quot;PostingOrganization&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Payment Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PaymentType&quot;,&quot;data-title&quot;:&quot;Payment Type&quot;},&quot;field&quot;:&quot;PaymentType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Check Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CheckNumber&quot;,&quot;data-title&quot;:&quot;Check Number&quot;},&quot;field&quot;:&quot;CheckNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Agency&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Agency&quot;,&quot;data-title&quot;:&quot;Agency&quot;},&quot;field&quot;:&quot;Agency&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendadjData(2)\&quot; id=\&quot;GenerateAdjDetailReportButton\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendadjData(1)\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/AdjustmentDetailReport_read&quot;,&quot;data&quot;:additionalInfo},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;VisitID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RevOrg&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Status&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Plan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AdjCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;BatchHeader&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostingOrganization&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ReasonCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ReasonCodeDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PaymentType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CheckNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Agency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});

    

    $(document).ready(function () {
       // UpdateGridSource();
    });
    function additionalInfo() {
        return {
            startdate: $(&quot;#TrStartDt&quot;).val(),
            enddate: $(&quot;#TrEndDt&quot;).val(),
        }
    }
    function UpdateGridSource()
    {
        $(&quot;#Results4&quot;).hide();
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        var searchCriteriaValid = ValidateSearchCriteriaAdj();

        if (searchCriteriaValid == true) {
            $(&quot;#Results4&quot;).show();
            $('#AdjustmentReport').data('kendoGrid').dataSource.read();
        }
        else {
            return false;
        }
    }
    function ValidateSearchCriteriaAdj() {

        var isValid = false;

        if ($('#TrStartDt').val() !== '' &amp;&amp; $('#TrEndDt').val() !== '') isValid = true;

        if (!isValid) {
            var InvalidFieldsMsg = &quot;&lt;li class='list-group-item'>Start Date&lt;/li>&quot; + &quot;&lt;li class='list-group-item'>End Date&lt;/li>&quot;;
            var Header = &quot;Please Select minimum search criteria listed below : &quot;;
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; + InvalidFieldsMsg + &quot;&lt;/ul>&quot;);
            $(&quot;#divValidationSummaryAdj&quot;).html($('#divValidationSummary'));
            $(&quot;#divValidationSummaryAdj&quot;).find('#validationSummaryTitle').first().text(Header);
            $('#divValidationSummary').show();
            
            return isValid;
        }
        return isValid;
    }
    function ParameterValues1() {
        var date = encodeURIComponent($(&quot;#EndDateARA&quot;).val());
        $(&quot;#GenerateAdjDetailReportButton&quot;).attr('href', '/DRISDEV/PatientAccounting/AdjustmentDetailReportPDF' + '?startdate=' + encodeURIComponent($(&quot;#TrStartDt&quot;).val()));
    }
    function UpdateAdjustmentExportLink() {
        $(&quot;#ExportAdjustmentButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExcelAdjustmentDetailReport' + '?startdate=' + encodeURIComponent($(&quot;#TrStartDt&quot;).val()) + '&amp;enddate=' + encodeURIComponent($(&quot;#TrEndDt&quot;).val()));
    }
      function sendadjData(datap) {   
          var grid = $(&quot;#AdjustmentReport&quot;).data(&quot;kendoGrid&quot;),
              parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#TrStartDt&quot;).val(), enddatevalue = $(&quot;#TrEndDt&quot;).val();
          if (datap == 1) {
                var url = '/DRISDEV/PatientAccounting/ExcelAdjustmentDetailReport';
          } else {
               var url = '/DRISDEV/PatientAccounting/AdjustmentDetailReportPDF';
          }
      
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
          window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue;
      
    }
    function AdjustmentDetailGridDataBound(e) { 
        AddTitleToGrid(e);
    }



            
            
                

    
       Transaction - Payment Report
    
    
        
            Select Start Date
            
                select
	jQuery(function(){jQuery(&quot;#CashTrStartDate1&quot;).kendoDatePicker({&quot;change&quot;:UpdateCashExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            Select End Date
            
                select
	jQuery(function(){jQuery(&quot;#CashTrEndDate1&quot;).kendoDatePicker({&quot;change&quot;:UpdateCashExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            
                
            
            
                
            
        
    


    Generate ReportExportSystemGroupPatient NameInvoice #LocationPatient TypeStatusPlanPMT CodeDescriptionService DateAmountPost DateBatchFacility LocationPayment TypeCheck NumberAgencyseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#CashDetailGrid&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:CashDetailGridDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice #&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;VisitID&quot;,&quot;data-title&quot;:&quot;Invoice #&quot;},&quot;field&quot;:&quot;VisitID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;RevOrg&quot;,&quot;data-title&quot;:&quot;Location&quot;},&quot;field&quot;:&quot;RevOrg&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Status&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Status&quot;,&quot;data-title&quot;:&quot;Status&quot;},&quot;field&quot;:&quot;Status&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Plan&quot;,&quot;data-title&quot;:&quot;Plan&quot;},&quot;field&quot;:&quot;Plan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;PMT Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PMTCode&quot;,&quot;data-title&quot;:&quot;PMT Code&quot;},&quot;field&quot;:&quot;PMTCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Description&quot;,&quot;data-title&quot;:&quot;Description&quot;},&quot;field&quot;:&quot;Description&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceDate&quot;,&quot;data-title&quot;:&quot;Service Date&quot;},&quot;field&quot;:&quot;ServiceDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Post Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostDate&quot;,&quot;data-title&quot;:&quot;Post Date&quot;},&quot;field&quot;:&quot;PostDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Batch&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Batch&quot;,&quot;data-title&quot;:&quot;Batch&quot;},&quot;field&quot;:&quot;Batch&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostingOrganization&quot;,&quot;data-title&quot;:&quot;Facility Location&quot;},&quot;field&quot;:&quot;PostingOrganization&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Payment Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PaymentType&quot;,&quot;data-title&quot;:&quot;Payment Type&quot;},&quot;field&quot;:&quot;PaymentType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Check Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CheckNumber&quot;,&quot;data-title&quot;:&quot;Check Number&quot;},&quot;field&quot;:&quot;CheckNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Agency&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Agency&quot;,&quot;data-title&quot;:&quot;Agency&quot;},&quot;field&quot;:&quot;Agency&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendCashreportDataforPDF()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendCashreportDataforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/CashDetailReport_read&quot;,&quot;data&quot;:cachAdditionalInfo},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;VisitID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RevOrg&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Status&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Plan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PMTCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Batch&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostingOrganization&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ReasonCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ReasonCodeDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PaymentType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CheckNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Agency&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});



    $(document).ready(function () {
       // UpdateGridSource();
    });

    function cachAdditionalInfo() {

        return {
            startdate: $(&quot;#CashTrStartDate1&quot;).val(),
            enddate: $(&quot;#CashTrEndDate1&quot;).val()
            }
    }

    function generatereport() {

        var startdate = $(&quot;#CashTrStartDate1&quot;).val();
        var enddate = $(&quot;#CashTrEndDate1&quot;).val();

            $.ajax({
                url: '/DRISDEV/PatientAccounting/CashDetailReportPDF',
                data: { startdate: startdate, enddate :enddate},
                type: 'GET',
                contentType: 'application/json; charset=utf-8',
                success: function (value) {
                    window.location = '/PatientAccounting/CashDetailReport?startdate=' + startdate + '&amp;enddate=' + enddate;
                }
            });
    }



    function UpdateGridSource3()
    {
        $(&quot;#Results5&quot;).hide();
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        var searchCriteriaValid = ValidateSearchCriteriaPay();

        if (searchCriteriaValid == true) {
            $(&quot;#Results5&quot;).show();
            $('#CashDetailGrid').data('kendoGrid').dataSource.read();
        }
        else {
            return false;
        }
    }
    function ValidateSearchCriteriaPay() {

        var isValid = false;

        if ($('#CashTrStartDate1').val() !== '' &amp;&amp; $('#CashTrEndDate1').val() !== '') isValid = true;

        if (!isValid) {

            $('#validationSummaryTitle').text('Please enter the minimum criteria listed below');
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; +
                &quot;&lt;li class='list-group-item'>Start Date&lt;/li>&quot; +
                &quot;&lt;li class='list-group-item'>End Date&lt;/li>&quot; +
                &quot;&lt;/ul>&quot;);
            $('#divValidationSummary').insertAfter('#divValidationSummaryPay:visible');
            $('#divValidationSummary').show();
            return isValid;
        }
        return isValid;
    }

    function ParameterValues() {
        var date = encodeURIComponent($(&quot;#EndDateARA&quot;).val());
        $(&quot;#GenerateCashDetailReportButton&quot;).attr('href', '/DRISDEV/PatientAccounting/CashDetailReportPDF' + '?startdate=' + encodeURIComponent($(&quot;#CashTrStartDate1&quot;).val()));
    }
    function UpdateCashExportLink() {
        $(&quot;#ExportCashButton&quot;).attr('href', '/DRISDEV/PatientAccounting/CashDetailReport' + '?startdate=' + encodeURIComponent($(&quot;#CashTrStartDate1&quot;).val()) + '&amp;enddate=' + encodeURIComponent($(&quot;#CashTrEndDate1&quot;).val()) );
    }

    function sendCashreportDataforExcel() {
       
        var grid = $(&quot;#CashDetailGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#CashTrStartDate1&quot;).val(), enddatevalue = $(&quot;#CashTrEndDate1&quot;).val();
        var url = '/DRISDEV/PatientAccounting/CashDetailReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue;
        
    }
    function sendCashreportDataforPDF() {
        
        var grid = $(&quot;#CashDetailGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#CashTrStartDate1&quot;).val(), enddatevalue = $(&quot;#CashTrEndDate1&quot;).val();
        var url = '/DRISDEV/PatientAccounting/CashDetailReportPDF';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue;
    }
    function CashDetailGridDataBound(e) {
        AddTitleToGrid(e);
    }





            
            
                
    
        
            Transaction - Write Off Report
        
        
            
                Start Date
                
                    select
	jQuery(function(){jQuery(&quot;#WriteOffStartDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                
                End Date
                
                    select
	jQuery(function(){jQuery(&quot;#WriteOffEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                
                System
                
                    --Select--select
	jQuery(function(){jQuery(&quot;#WriteOffSystem&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Allscripts_eCare&quot;,&quot;Value&quot;:&quot;Allscripts_eCare&quot;},{&quot;Text&quot;:&quot;Cerner&quot;,&quot;Value&quot;:&quot;Cerner&quot;},{&quot;Text&quot;:&quot;Paragon&quot;,&quot;Value&quot;:&quot;Paragon&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

                
            
                
                    Facility
                    
                        --Select--select
	jQuery(function(){jQuery(&quot;#FacilityWriteOff&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Admission Type&quot;,&quot;Value&quot;:&quot;Admission Type&quot;},{&quot;Text&quot;:&quot;Assigned Patient Location&quot;,&quot;Value&quot;:&quot;Assigned Patient Location&quot;},{&quot;Text&quot;:&quot;Preadmit Number&quot;,&quot;Value&quot;:&quot;Preadmit Number&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

                    
                    Financial Class
                    
                        --Select--select
	jQuery(function(){jQuery(&quot;#3&quot;).kendoDropDownList({&quot;dataSource&quot;:[],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

                    
                    Cycle Name
                    
                        --Select--select
	jQuery(function(){jQuery(&quot;#Cycle&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;SPA1&quot;,&quot;Value&quot;:&quot;SPA1&quot;},{&quot;Text&quot;:&quot;SPA2&quot;,&quot;Value&quot;:&quot;SPA2&quot;},{&quot;Text&quot;:&quot;Test Cycle&quot;,&quot;Value&quot;:&quot;Test Cycle&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

                    
                
                
                    Cycle Step
                    
                        Increase valueDecrease valueIncrease valueDecrease value
	jQuery(function(){jQuery(&quot;#CycleStep&quot;).kendoNumericTextBox({});});

                    
                
                
                    
                        Search
                        Clear
                        
                            
                            
                                
                                    
                                    Please correct the following Errors
                                
                                

                                
                            
                        
                    
                
        
    
    
        ExportSystemGroupPatient NameFacilityFinancial ClassCycle NameCycle StepAccount NumberInvoice NumberBill DatePosted DatePay CodeDescriptionAmountAgencyseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#WriteOffGrid&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:WriteOffGridDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;WriteOffSystem&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;WriteOffSystem&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FacilityWriteOff&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;FacilityWriteOff&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;FinancialClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Cycle Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Cycle&quot;,&quot;data-title&quot;:&quot;Cycle Name&quot;},&quot;field&quot;:&quot;Cycle&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Cycle Step&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CycleStep&quot;,&quot;data-title&quot;:&quot;Cycle Step&quot;},&quot;field&quot;:&quot;CycleStep&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Bill Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillDate&quot;,&quot;data-title&quot;:&quot;Bill Date&quot;},&quot;field&quot;:&quot;BillDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Posted Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostedDate&quot;,&quot;data-title&quot;:&quot;Posted Date&quot;},&quot;field&quot;:&quot;PostedDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Pay Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayCode&quot;,&quot;data-title&quot;:&quot;Pay Code&quot;},&quot;field&quot;:&quot;PayCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayCodeDescription&quot;,&quot;data-title&quot;:&quot;Description&quot;},&quot;field&quot;:&quot;PayCodeDescription&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Agency&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Agency&quot;,&quot;data-title&quot;:&quot;Agency&quot;},&quot;field&quot;:&quot;Agency&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendWriteOffDataforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/WriteOff_read&quot;,&quot;data&quot;:GetCriteriaJson},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;WriteOffSystem&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FacilityWriteOff&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PostedDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PayCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayCodeDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Cycle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleStep&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Agency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;systemlist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;facilitylist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;financialclasslist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;cyclelist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;WriteOffStartDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;WriteOffEndDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});


    



    $(function () {
        $(&quot;input&quot;).keypress(function (e) {
            if (e.which == 13) {
                Search();
            }
        });
    });

        // Start and End date validation logic
    $(document).ready(function () {
        var writeOffStartDate = $(&quot;#WriteOffStartDate&quot;).kendoDatePicker({
            change: writeOffStartDateChange
        }).data(&quot;kendoDatePicker&quot;);

        var writeOffEndDate = $(&quot;#WriteOffEndDate&quot;).kendoDatePicker({
            change: writeOffEndDateChange
        }).data(&quot;kendoDatePicker&quot;);

        writeOffStartDate.max(writeOffEndDate.value());
        writeOffEndDate.min(writeOffStartDate.value());

        function writeOffStartDateChange() {
            var startDate = writeOffStartDate.value(),
                endDate = writeOffEndDate.value();

            if (startDate) {
                startDate = new Date(startDate);
                startDate.setDate(startDate.getDate());
                writeOffEndDate.min(startDate);
            } else if (endDate) {
                writeOffStartDate.max(new Date(endDate));
            } else {
                endDate = new Date();
                writeOffStartDate.max(endDate);
                writeOffEndDate.min(endDate);
            }
        }

        function writeOffEndDateChange() {
            var endDate = writeOffEndDate.value(),
                startDate = writeOffStartDate.value();

            if (endDate) {
                endDate = new Date(endDate);
                endDate.setDate(endDate.getDate());
                writeOffStartDate.max(endDate);
            } else if (startDate) {
                writeOffEndDate.min(new Date(startDate));
            } else {
                endDate = new Date();
                writeOffStartDate.max(endDate);
                writeOffEndDate.min(endDate);
            }
        }
    });

    function sendWriteOffDataforExcel() {
        var criteriaJson = JSON.stringify($('#SearchForm').serializeObject())
        var grid = $(&quot;#WriteOffGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap;
        var url = '/DRISDEV/PatientAccounting/ExportWriteOffReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;criteriaJson=&quot; + criteriaJson;
    }

    function Clear2() {
        $('#divValidationSummaryWriteOff').hide();
        $('#listValidationErrorsWriteOff').empty();
        $(&quot;.field-validation-error&quot;).hide();

        $('#SearchForm')[0].reset();
        $(&quot;#SearchResults&quot;).hide();
    }

    function GetCriteriaJson() {
        return { criteriaJson: JSON.stringify($('#SearchForm').serializeObject()) };
    }

    function Search() {
        $(&quot;#SearchResults&quot;).hide();
        $('#divValidationSummaryWriteOff').hide();
        $('#listValidationErrorsWriteOff').empty();
        var searchCriteriaValid = ValidateSearchCriteria();
        if (!searchCriteriaValid) return;

        $(&quot;#SearchResults&quot;).show();

        var grid = $('#WriteOffGrid').data('kendoGrid');
        grid.dataSource.read();
    }

    function ValidateSearchCriteria() {
        var isValid = false;
        if ($('#WriteOffSystem').val() !== '') isValid = true;
        if ($('#FacilityWriteOff').val() !== '') isValid = true;
        if ($('#FinancialClass').val() !== '') isValid = true;
        if ($('#CycleID').val() !== '') isValid = true;
        if ($('#CycleStep').val() !== '') isValid = true;

        isValid = $('#SearchForm').valid();

        if (!isValid) {          
            $('#listValidationErrorsWriteOff').html(&quot;&lt;ul class='list-group list-group-flush'>&lt;li class='list-group-item'>Start Date&lt;/li>&lt;li class='list-group-item'>End Date&lt;/li>&lt;/ul>&quot;);
            $('#divValidationSummaryWriteOff').show(); isValid = false;
            return isValid;
        }

        return isValid;
    }

    function WriteOffGridDataBound(e) {
        AddTitleToGrid(e);
    }

    


            
            
                

    Batch - Batch Report ResultsRefreshExportRefund IDBatch NumberUserTypeStatusCurrent PlanCreated DateDeposit DateClosed DateFacility LocationTrans Control #Trans Control AmtTrans #PAY TotalADJ TotalTrans Amt28220200709_vgaikwad_153vgaikwadRefundOpen7/9/2020 5:55:46 PM01($20.00)$0.00($20.00)27920200709_sskousen_150sskousenPaymentOpen7/9/2020 8:20:11 AM1$60.001$0.00($60.00)($60.00)28020200709_gjaiswal_151gjaiswal837Open7/9/2020 1:21:48 PM0$0.00$0.00$0.0028120200709_dnorman_152dnormanRefundOpen7/9/2020 2:29:03 PM0$0.00$0.00$0.0027520200708_vgaikwad_146vgaikwadPaymentOpen7/8/2020 1:24:53 PM00$0.00$0.00$0.0027320200708_sshinde_144sshindePaymentOpen7/8/2020 4:19:49 AM00$0.00$0.00$0.0027720200708_adonepudi_148adonepudi837Open7/8/2020 7:18:22 PM0$0.00$0.00$0.0026820200707_rnalawade_143rnalawadeRefundOpen7/7/2020 8:59:36 AM00$0.00$0.00$0.0026720200707_rnalawade_142rnalawadePaymentOpen7/7/2020 8:59:32 AM01$5.00$0.00$5.0026620200707_rnalawade_141rnalawadePaymentOpen7/7/2020 8:41:30 AM00$0.00$0.00$0.0026320200707_rnalawade_140rnalawadePaymentOpen7/7/2020 8:29:09 AM00$0.00$0.00$0.0025920200703_ashaikh_137ashaikhPaymentOpen7/3/2020 7:58:48 AM01$0.00$0.00$0.0025820200702_sskousen_136sskousenRefundOpen7/2/2020 12:06:54 PM0$0.00$0.00$0.0024920200701_rnalawade_130rnalawadeRefundOpen7/1/2020 5:02:01 AM0$2.000$0.00$0.00$0.0024120200630_sshinde_122sshindeRefundOpen6/30/2020 6:08:49 AM0$0.00$0.00$0.0024820200630_rnalawade_129rnalawadeRefundOpen6/30/2020 11:46:17 AMAlfie1$1.000$0.00$0.00$0.0024720200630_rnalawade_128rnalawadePaymentOpen6/30/2020 11:46:09 AM6/30/2020 12:00:00 AMAlfie1$1.000$0.00$0.00$0.0024620200630_rnalawade_127rnalawadeRefundOpen6/30/2020 9:30:21 AMAlfie00$0.00$0.00$0.0024520200630_rnalawade_126rnalawadePaymentOpen6/30/2020 9:30:14 AMAlfie1$1.000$0.00$0.00$0.0024420200630_rnalawade_125rnalawadeRefundOpen6/30/2020 6:33:57 AM6/30/2020 12:00:00 AMAlfie1$1.000$0.00$0.00$0.00seek-warrow-w112345arrow-eseek-e20select152550100items per pageRefresh1 - 20 of 94 items
	jQuery(function(){jQuery(&quot;#BatchReportGrid&quot;).kendoGrid({&quot;dataBound&quot;:DataBoundBatch,&quot;detailInit&quot;:detailInitBatch,&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;columns&quot;:[{&quot;title&quot;:&quot;ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ID&quot;,&quot;data-title&quot;:&quot;ID&quot;},&quot;field&quot;:&quot;ID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Batch Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BatchNumber&quot;,&quot;data-title&quot;:&quot;Batch Number&quot;},&quot;field&quot;:&quot;BatchNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;User&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;UserName&quot;,&quot;data-title&quot;:&quot;User&quot;},&quot;field&quot;:&quot;UserName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BatchType.Name&quot;,&quot;data-title&quot;:&quot;Type&quot;},&quot;field&quot;:&quot;BatchType.Name&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Status&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BatchStatusType.Name&quot;,&quot;data-title&quot;:&quot;Status&quot;},&quot;field&quot;:&quot;BatchStatusType.Name&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Created Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CreatedDate&quot;,&quot;data-title&quot;:&quot;Created Date&quot;},&quot;field&quot;:&quot;CreatedDate&quot;,&quot;format&quot;:&quot;{0:G}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Deposit Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostDate&quot;,&quot;data-title&quot;:&quot;Deposit Date&quot;},&quot;field&quot;:&quot;PostDate&quot;,&quot;format&quot;:&quot;{0:G}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Closed Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ClosedDate&quot;,&quot;data-title&quot;:&quot;Closed Date&quot;},&quot;field&quot;:&quot;ClosedDate&quot;,&quot;format&quot;:&quot;{0:G}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PostingOrganization&quot;,&quot;data-title&quot;:&quot;Facility Location&quot;},&quot;field&quot;:&quot;PostingOrganization&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Trans Control #&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionCount&quot;,&quot;data-title&quot;:&quot;Trans Control #&quot;},&quot;field&quot;:&quot;TransactionCount&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Trans Control Amt&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionAmount&quot;,&quot;data-title&quot;:&quot;Trans Control Amt&quot;},&quot;field&quot;:&quot;TransactionAmount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Trans #&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionCountCalc&quot;,&quot;data-title&quot;:&quot;Trans #&quot;},&quot;field&quot;:&quot;TransactionCountCalc&quot;,&quot;sortable&quot;:false,&quot;filterable&quot;:false,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;PAY Total&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PaymentCalc&quot;,&quot;data-title&quot;:&quot;PAY Total&quot;},&quot;field&quot;:&quot;PaymentCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;sortable&quot;:false,&quot;filterable&quot;:false,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;ADJ Total&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdjustmentCalc&quot;,&quot;data-title&quot;:&quot;ADJ Total&quot;},&quot;field&quot;:&quot;AdjustmentCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;sortable&quot;:false,&quot;filterable&quot;:false,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Trans Amt&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionAmountCalc&quot;,&quot;data-title&quot;:&quot;Trans Amt&quot;},&quot;field&quot;:&quot;TransactionAmountCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;sortable&quot;:false,&quot;filterable&quot;:false,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;refresh&quot;:true,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true,&quot;filterable&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:&quot;RefreshButton&quot;,&quot;attr&quot;:&quot; onclick=\&quot;refreshData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;\u003cspan class=\u0027k-icon k-i-refresh\u0027\u003e\u003c/span\u003eRefresh&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendBatchDataExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendClosedBatchDataExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Refund&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/BatchReport_read&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:20,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;BatchNumber&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;id&quot;:&quot;ID&quot;,&quot;fields&quot;:{&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;BatchNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BatchStatusType&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;BatchType&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;CreatedDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PostingOrganization&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionCount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TransactionAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TransactionCountCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TransactionAmountCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PaymentCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AdjustmentCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ClosedDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null}}}}},&quot;detailTemplate&quot;:kendo.template(jQuery('#detailTemplateBatch').html())});});

    
    
            &lt;div class=&quot;detailDiv&quot; />

    

    
    function refreshData(){
        $('#BatchReportGrid').data('kendoGrid').dataSource.read();
    }

    function detailInitBatch(e) {
        GridDetailNestedContent(e);

        kendo.ui.progress(e.sender.element, true);
        var id = &quot;detailDivBatch_&quot; + e.data.BatchNumber;
        var detailRow = e.detailRow;
        detailRow.find(&quot;.detailDiv&quot;).attr(&quot;id&quot;, id);
        detailRow.find(&quot;.detailDiv&quot;).load('/DRISDEV/PatientAccounting/GetBatchDetails' + &quot;/&quot; + e.data.BatchNumber, function () { kendo.ui.progress(e.sender.element, false); });
    }

    var firsttimeFlag = true;
    function DataBoundBatch(e) {
        AddTitleToGrid(e);

        if (firsttimeFlag) {
            var batchReportGrid = $(&quot;#BatchReportGrid&quot;).data(&quot;kendoGrid&quot;);
            var dataFilter = new Array();
            dataFilter.push({ field: &quot;BatchStatusType.Name&quot;, operator: &quot;eq&quot;, value: &quot;Open&quot; });
            batchReportGrid.dataSource.filter({ logic: &quot;or&quot;, filters: dataFilter });
            firsttimeFlag = false;
        }
    }

    function sendBatchDataExcel() {
        var grid = $(&quot;#BatchReportGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap;
        var url = '/DRISDEV/PatientAccounting/BatchDetailReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam;
    }

    function sendClosedBatchDataExcel() {
       // debugger;
        var grid = $(&quot;#BatchReportGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap;
        var url = '/DRISDEV/PatientAccounting/ClosedBatchDetailReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam;

    }
    


            
            
                


    
        AR - Open AR Balance Charge Level Report
    
    
        
            Select Date
            
                select
	jQuery(function(){jQuery(&quot;#EndDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateOpenARExportLink,&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2020,6,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});

            
            
                
            
        
    





    ExportReport DateSystemGroupMRNLast NameFirst NameGuarantor First NameGuarantor Last NameAccount NumberInvoice NumberService DateReferencePerforming PhysicianReferring PhysicianDepartmentDivisionFacilityPOSCurrent PlanCPT CodeModifiersChargeBalanceseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#OpenARGrid&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;Report Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ReportDate&quot;,&quot;data-title&quot;:&quot;Report Date&quot;},&quot;field&quot;:&quot;ReportDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;MRN&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;MRN&quot;,&quot;data-title&quot;:&quot;MRN&quot;},&quot;field&quot;:&quot;MRN&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Last Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;LastName&quot;,&quot;data-title&quot;:&quot;Last Name&quot;},&quot;field&quot;:&quot;LastName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;First Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FirstName&quot;,&quot;data-title&quot;:&quot;First Name&quot;},&quot;field&quot;:&quot;FirstName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor First Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorFirstName&quot;,&quot;data-title&quot;:&quot;Guarantor First Name&quot;},&quot;field&quot;:&quot;GuarantorFirstName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Last Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorLastName&quot;,&quot;data-title&quot;:&quot;Guarantor Last Name&quot;},&quot;field&quot;:&quot;GuarantorLastName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceDate&quot;,&quot;data-title&quot;:&quot;Service Date&quot;},&quot;field&quot;:&quot;ServiceDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Reference&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Reference&quot;,&quot;data-title&quot;:&quot;Reference&quot;},&quot;field&quot;:&quot;Reference&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Performing Physician&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PerformingPhysician&quot;,&quot;data-title&quot;:&quot;Performing Physician&quot;},&quot;field&quot;:&quot;PerformingPhysician&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Referring Physician&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ReferringPhysician&quot;,&quot;data-title&quot;:&quot;Referring Physician&quot;},&quot;field&quot;:&quot;ReferringPhysician&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Department&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Department&quot;,&quot;data-title&quot;:&quot;Department&quot;},&quot;field&quot;:&quot;Department&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Division&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Division&quot;,&quot;data-title&quot;:&quot;Division&quot;},&quot;field&quot;:&quot;Division&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;POS&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;POS&quot;,&quot;data-title&quot;:&quot;POS&quot;},&quot;field&quot;:&quot;POS&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;CPT Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CPTCode&quot;,&quot;data-title&quot;:&quot;CPT Code&quot;},&quot;field&quot;:&quot;CPTCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Modifiers&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargeModifiers&quot;,&quot;data-title&quot;:&quot;Modifiers&quot;},&quot;field&quot;:&quot;ChargeModifiers&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charge&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargeAmount&quot;,&quot;data-title&quot;:&quot;Charge&quot;},&quot;field&quot;:&quot;ChargeAmount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BalanceCalc&quot;,&quot;data-title&quot;:&quot;Balance&quot;},&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendArBalanceReportExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/OpenARBalance_read&quot;,&quot;data&quot;:additionalInfoforgrid},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ReportDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorFirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorLastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Reference&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CPTCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ChargeModifiers&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PerformingPhysician&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ReferringPhysician&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DiagnosisCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ChargeAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BalanceCalc&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;IsMonthEnd&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});



    function additionalInfoforgrid() {
        return {
            //startdate: $(&quot;#StartDate&quot;).val(),
            enddate: $(&quot;#EndDate&quot;).val(),
        }
    }

    function UpdateOpenARGridSource() {
        $(&quot;#Result&quot;).hide();
        $(&quot;#Result&quot;).show();
        $('#OpenARGrid').data('kendoGrid').dataSource.read();
        //$('#OpenARGrid').data('kendoGrid').refresh();
    }

    function UpdateOpenARExportLink() {
        $(&quot;#ExportOpenARButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportOpenAR' + '?enddate=' + encodeURIComponent($(&quot;#EndDate&quot;).val()));
    }

    function sendArBalanceReportExcel() {
        var grid = $(&quot;#OpenARGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#EndDate&quot;).val();
        var url = '/DRISDEV/PatientAccounting/ExportOpenAR';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;
    }



            
            
                


    
        AR - Open AR Balance Invoice Level Report
    
    
        
            Select Date
            
                select
	jQuery(function(){jQuery(&quot;#EndDateInvoice&quot;).kendoDatePicker({&quot;change&quot;:UpdateOpenARExportLinkInvoice,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2020,6,9,10,41,19,651)});});

            
            
                
            
        
    





    ExportInvoice IDAccount NumberGuarantor NameInvoice NumberFinancial ClassCurrent PlanService From DateService Through DateBilling DateAttending Physician NameHospital NameBilling AreaChargesBalance Calcseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#OpenARGridInvoice&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;columns&quot;:[{&quot;title&quot;:&quot;Invoice ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceID&quot;,&quot;data-title&quot;:&quot;Invoice ID&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;InvoiceID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorName&quot;,&quot;data-title&quot;:&quot;Guarantor Name&quot;},&quot;field&quot;:&quot;GuarantorName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;FinancialClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service From Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceFromDate&quot;,&quot;data-title&quot;:&quot;Service From Date&quot;},&quot;field&quot;:&quot;ServiceFromDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Through Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceThroughDate&quot;,&quot;data-title&quot;:&quot;Service Through Date&quot;},&quot;field&quot;:&quot;ServiceThroughDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Billing Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillingDate&quot;,&quot;data-title&quot;:&quot;Billing Date&quot;},&quot;field&quot;:&quot;BillingDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Attending Physician Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AttendingPhysicianName&quot;,&quot;data-title&quot;:&quot;Attending Physician Name&quot;},&quot;field&quot;:&quot;AttendingPhysicianName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Hospital Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;HospitalName&quot;,&quot;data-title&quot;:&quot;Hospital Name&quot;},&quot;field&quot;:&quot;HospitalName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Billing Area&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillingArea&quot;,&quot;data-title&quot;:&quot;Billing Area&quot;},&quot;field&quot;:&quot;BillingArea&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charges&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Charges&quot;,&quot;data-title&quot;:&quot;Charges&quot;},&quot;field&quot;:&quot;Charges&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance Calc&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BalanceCalc&quot;,&quot;data-title&quot;:&quot;Balance Calc&quot;},&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendOpenARinvoiceforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/OpenARBalanceInvoice_read&quot;,&quot;data&quot;:additionalInfoforgridinvoice},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ReportDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;InvoiceID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MiddleName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceFromDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceThroughDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AttendingPhysicianName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;HospitalName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingArea&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Charges&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BalanceCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;IsMonthEnd&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;PatientCategory&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountStatus&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SubscriberNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FullName&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;ServiceCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Payments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Adjustments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayorClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClassTypeID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleStepID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleTaskID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UserID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AgentCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DOB&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceAgeInDays&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Cycle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleStep&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleTask&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CommentDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Comment&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Balance&quot;:{&quot;type&quot;:&quot;number&quot;}}}}}});});



    function additionalInfoforgridinvoice() {
        return {
            //startdate: $(&quot;#StartDate&quot;).val(),
            enddate: $(&quot;#EndDateInvoice&quot;).val(),
        }
    }

    function UpdateOpenARGridSourceInvoice() {
        $(&quot;#Results2&quot;).hide();
        $(&quot;#Results2&quot;).show();
        $('#OpenARGridInvoice').data('kendoGrid').dataSource.read();
    }

    function UpdateOpenARExportLinkInvoice() {
        $(&quot;#ExportOpenARButtonInvoice&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportOpenARInvoice' + '?enddate=' + encodeURIComponent($(&quot;#EndDateInvoice&quot;).val()));
    }

    function sendOpenARinvoiceforExcel() {
        var grid = $(&quot;#OpenARGridInvoice&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#EndDateInvoice&quot;).val();
        var url = '/DRISDEV/PatientAccounting/ExportOpenARInvoice';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;
    }



            
            
                

    
        AR - AR Report
    
    
        
            Select Date
            
                select
	jQuery(function(){jQuery(&quot;#EndDateARA&quot;).kendoDatePicker({&quot;change&quot;:UpdateARAExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2020,6,9,10,41,20,171)});});

            
                Aged By
                
                    Bill Dateselect
	jQuery(function(){jQuery(&quot;#ddlAgedByARA&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Bill Date&quot;,&quot;Value&quot;:&quot;BillDate&quot;},{&quot;Text&quot;:&quot;Admit Date&quot;,&quot;Value&quot;:&quot;AdmitDate&quot;},{&quot;Text&quot;:&quot;Discharge Date&quot;,&quot;Value&quot;:&quot;DischargeDate&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;});});

                
            
            
                
            
        
    


  
        ExportGenerate ReportSystemGroupAccount NumberPatient NameAccount StatusCurrent PlanAttending Physician NamePatient TypeFinancial ClassService From DateService Through DateChargesBalance CalcBilling Dateseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#ARAReportGrid&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:ARAReportGridDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FullName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;FullName&quot;,&quot;sortable&quot;:false,&quot;filterable&quot;:false,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Status&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountStatus&quot;,&quot;data-title&quot;:&quot;Account Status&quot;},&quot;field&quot;:&quot;AccountStatus&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=CurrentPlan&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Attending Physician Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AttendingPhysicianName&quot;,&quot;data-title&quot;:&quot;Attending Physician Name&quot;},&quot;field&quot;:&quot;AttendingPhysicianName&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=AttendingPhysicianName&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=PatientType&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;FinancialClass&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=FinancialClass&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service From Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceFromDate&quot;,&quot;data-title&quot;:&quot;Service From Date&quot;},&quot;field&quot;:&quot;ServiceFromDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Through Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceThroughDate&quot;,&quot;data-title&quot;:&quot;Service Through Date&quot;},&quot;field&quot;:&quot;ServiceThroughDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charges&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Charges&quot;,&quot;data-title&quot;:&quot;Charges&quot;},&quot;field&quot;:&quot;Charges&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance Calc&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BalanceCalc&quot;,&quot;data-title&quot;:&quot;Balance Calc&quot;},&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Billing Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillingDate&quot;,&quot;data-title&quot;:&quot;Billing Date&quot;},&quot;field&quot;:&quot;BillingDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendaraData(1)\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendaraData(2)\&quot; id=\&quot;GenerateARAReportButton\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/ARAReport_read&quot;,&quot;data&quot;:ARAData},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ReportDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;InvoiceID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MiddleName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceFromDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceThroughDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AttendingPhysicianName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;HospitalName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingArea&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Charges&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BalanceCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;IsMonthEnd&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;PatientCategory&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountStatus&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SubscriberNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FullName&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;ServiceCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Payments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Adjustments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayorClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClassTypeID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleStepID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleTaskID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UserID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AgentCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DOB&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceAgeInDays&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Cycle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleStep&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleTask&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CommentDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Comment&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;}}}}}});});

    

    
    //$(&quot;#getdatagridbutton&quot;).click(function () {
    //    $('#ARAReportGrid').data('kendoGrid').dataSource.read();
        //});

        function ARAData() {           
            var getValdate = $(&quot;#EndDateARA&quot;).val();
            return {
                enddate: getValdate,
                //enddate: $(&quot;#TrEndDt&quot;).val(),
                //returnTargetedDate(getValdate)
            }
        }

    

    function GetARGridData() {
        $(&quot;#Results7&quot;).hide();
        $(&quot;#Results7&quot;).show();
        $('#ARAReportGrid').data('kendoGrid').dataSource.read();
    }
    function UpdateARAExportLink() {
        $(&quot;#ExportARAReportButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportARAReport' + '?enddate=' + encodeURIComponent($(&quot;#EndDateARA&quot;).val()));
    }
    function ParameterValues() {
        var date = encodeURIComponent($(&quot;#EndDateARA&quot;).val());
        $(&quot;#GenerateARAReportButton&quot;).attr('href', '/DRISDEV/Report/ARAGenerateReport' + '?enddate=' + encodeURIComponent($(&quot;#EndDateARA&quot;).val()));
    }
    function sendaraData(datap) {
        var grid = $(&quot;#ARAReportGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#EndDateARA&quot;).val();
        var url='';
        if (datap == 1)
        {
            url = '/DRISDEV/PatientAccounting/ExportARAReport';
        } else {
            url = '/DRISDEV/Report/ARAGenerateReport';
        }

        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;

    }
        function ARAReportGridDataBound(e) {
            AddTitleToGrid(e);
        }
    

            
            
                

    
       AR - ATB Report
    
    
        
            Select Date
            
                select
	jQuery(function(){jQuery(&quot;#EndDateATB&quot;).kendoDatePicker({&quot;change&quot;:UpdateATBExportLink,&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2020,6,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});

            
            Aged By
            
                Bill Dateselect
	jQuery(function(){jQuery(&quot;#ddlAgedByATB&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Bill Date&quot;,&quot;Value&quot;:&quot;BillDate&quot;},{&quot;Text&quot;:&quot;Admit Date&quot;,&quot;Value&quot;:&quot;AdmitDate&quot;},{&quot;Text&quot;:&quot;Discharge Date&quot;,&quot;Value&quot;:&quot;DischargeDate&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;});});


            
            
                
            
        
    



    ExportGenerate ReportSystemGroupFacilityInvoice #Patient NameGuarantor NameAccount StatusPatient TypeCurrent PlanFinancial ClassService DateAdmit DateDischarge DateChargesBalanceBilling Dateseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#ATBGrid&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:ATBGridDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice #&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice #&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FullName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;FullName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorName&quot;,&quot;data-title&quot;:&quot;Guarantor Name&quot;},&quot;field&quot;:&quot;GuarantorName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Status&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountStatus&quot;,&quot;data-title&quot;:&quot;Account Status&quot;},&quot;field&quot;:&quot;AccountStatus&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=PatientType&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=CurrentPlan&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;FinancialClass&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=FinancialClass&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceDate&quot;,&quot;data-title&quot;:&quot;Service Date&quot;},&quot;field&quot;:&quot;ServiceDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Admit Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceFromDate&quot;,&quot;data-title&quot;:&quot;Admit Date&quot;},&quot;field&quot;:&quot;ServiceFromDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Discharge Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceThroughDate&quot;,&quot;data-title&quot;:&quot;Discharge Date&quot;},&quot;field&quot;:&quot;ServiceThroughDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charges&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Charges&quot;,&quot;data-title&quot;:&quot;Charges&quot;},&quot;field&quot;:&quot;Charges&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BalanceCalc&quot;,&quot;data-title&quot;:&quot;Balance&quot;},&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Billing Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillingDate&quot;,&quot;data-title&quot;:&quot;Billing Date&quot;},&quot;field&quot;:&quot;BillingDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendData(1)\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendData(2)\&quot; id=\&quot;GenerateATBReportButton\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/ATBReport_read&quot;,&quot;data&quot;:ATBData},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ReportDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;InvoiceID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MiddleName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceFromDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceThroughDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AttendingPhysicianName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;HospitalName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingArea&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Charges&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BalanceCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;IsMonthEnd&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;PatientCategory&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountStatus&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SubscriberNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FullName&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;ServiceCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Payments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Adjustments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayorClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClassTypeID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleStepID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleTaskID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UserID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AgentCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DOB&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceAgeInDays&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Cycle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleStep&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleTask&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CommentDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Comment&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;}}}}}});});



    //$(&quot;#getdatagridbutton&quot;).click(function () {
    //    $('#ARAReportGrid').data('kendoGrid').dataSource.read();
    //});

    function GetATBGridData() {
        $(&quot;#Results8&quot;).hide();
        $(&quot;#Results8&quot;).show();
        $('#ATBGrid').data('kendoGrid').dataSource.read();
    }

    function UpdateATBExportLink() {
        $(&quot;#ExportATBReportButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportATBReport' + '?enddate=' + encodeURIComponent($(&quot;#EndDateATB&quot;).val()));
    }


    function ATBData() {

        return {
            enddate: $(&quot;#EndDateATB&quot;).val(),
            //enddate: $(&quot;#TrEndDt&quot;).val(),
        }
    }
    function ATBParameterValues() {
        var date = encodeURIComponent($(&quot;#EndDateARA&quot;).val());
        $(&quot;#GenerateATBReportButton&quot;).attr('href', '/DRISDEV/Report/ATBReport' + '?enddate=' + encodeURIComponent($(&quot;#EndDateATB&quot;).val()));
    }

    function sendData(_data) {
        debugger;
        var grid = $(&quot;#ATBGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#EndDateATB&quot;).val();
        var url='';
        if (_data == 1)
        {
            url = '/DRISDEV/PatientAccounting/ExportATBReport';
        } else {
            url = '/DRISDEV/Report/ATBReport';
        }

        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;
        //$.ajax({
        //    url: &quot;/PatientAccounting/PostATBReport&quot;,
        //    data: {request: data, enddate : $(&quot;#EndDateATB&quot;).val()},
        //    type: &quot;POST&quot;,
        //    success: function (d) {
        //        if (d.success) {
        //            window.location = getUrl + &quot;?request=&quot; + data + &quot;/&quot; + &quot;enddate=&quot; + $(&quot;#EndDateATB&quot;).val();
        //        }
        //    },
        //});
    }



    //$('.k-primary').click(function () {


    $(&quot;.k-primary&quot;).on('click', function (event) {
        alert();
        debugger;

        // get the kendoGrid element.
        var gridData = $(&quot;#ATBGrid&quot;).data(&quot;kendoGrid&quot;);

        // get currently applied filters from the Grid.
        var currFilterObj = gridData.dataSource.filter();

        // get current set of filters, which is supposed to be array.
        // if the oject we obtained above is null/undefined, set this to an empty array
        var currentFilters = currFilterObj ? currFilterObj.filters : [];

        // iterate over current filters array. if a filter for &quot;filterField&quot; is already
        // defined, remove it from the array
        // once an entry is removed, we stop looking at the rest of the array.
        if (currentFilters &amp;&amp; currentFilters.length > 0) {
            for (var i = 0; i &lt; currentFilters.length; i++) {
                if (currentFilters[i].field == &quot;FullName&quot;) {
                    currentFilters.splice(i, 1);
                    break;
                }
            }
        }

        // if &quot;filterValue&quot; is &quot;0&quot;, meaning &quot;-- select --&quot; option is selected, we don't
        // do any further processing. That will be equivalent of removing the filter.
        // if a filterValue is selected, we add a new object to the currentFilters array.
        if (filterValue != &quot;0&quot;) {
            currentFilters.push({ field: filterField, operator: &quot;eq&quot;, value: filterValue });
        }
        // finally, the currentFilters array is applied back to the Grid, using &quot;and&quot; logic.
        gridData.dataSource.filter({ logic: &quot;and&quot;, filters: currentFilters });
    });
    function ATBGridDataBound(e) {
        AddTitleToGrid(e);
    }



    //$(&quot;#ATBGrid&quot;).kendoGrid({
       
    //    filterable: true,
    //    filter: function (e) {

    //        debugger;
    //        if (e.filter == null) {
    //            console.log(&quot;filter has been cleared&quot;);
    //        } else {
    //            console.log(e.filter.logic);
    //            console.log(e.filter.filters[0].field);
    //            console.log(e.filter.filters[0].operator);
    //            console.log(e.filter.filters[0].value);
    //        }
    //    }
    //});


            
                
                    


    
       GL - AR Month End Report
    
    
        
            Select Month and Year
            
                select
	jQuery(function(){jQuery(&quot;#ARMonthEndDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateARMonthEndExportLink,&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});

            
            
                
            
        
    


    ExportSystemFirst NameAccount NumberLocationPatient TypeFinancial ClassDischarge DateChargesPaymentsAdjustmentsBalanceseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#ARMonthEndGrid&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;First Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FirstName&quot;,&quot;data-title&quot;:&quot;First Name&quot;},&quot;field&quot;:&quot;FirstName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Location&quot;,&quot;data-title&quot;:&quot;Location&quot;},&quot;field&quot;:&quot;Location&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;FinancialClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Discharge Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DischargeDate&quot;,&quot;data-title&quot;:&quot;Discharge Date&quot;},&quot;field&quot;:&quot;DischargeDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charges&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Charges&quot;,&quot;data-title&quot;:&quot;Charges&quot;},&quot;field&quot;:&quot;Charges&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Payments&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Payments&quot;,&quot;data-title&quot;:&quot;Payments&quot;},&quot;field&quot;:&quot;Payments&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Adjustments&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Adjustments&quot;,&quot;data-title&quot;:&quot;Adjustments&quot;},&quot;field&quot;:&quot;Adjustments&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BalanceCalc&quot;,&quot;data-title&quot;:&quot;Balance&quot;},&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendARMonthData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/ARMonthEnd_read&quot;,&quot;data&quot;:ARMonthEndData},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ReportDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;InvoiceID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MiddleName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceFromDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceThroughDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AttendingPhysicianName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;HospitalName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingArea&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Charges&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BalanceCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;IsMonthEnd&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;PatientCategory&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountStatus&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FullName&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;ServiceCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Payments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Adjustments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayorClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null}}}}}});});




    function GetARMonthEndGridData() {
        $(&quot;#ARMonthEndResults&quot;).hide();
        $(&quot;#ARMonthEndResults&quot;).show();
        $('#ARMonthEndGrid').data('kendoGrid').dataSource.read();
    }

    function ARMonthEndData() {
        return {
            ARMonthEndDate: $(&quot;#ARMonthEndDate&quot;).val(),
            //enddate: $(&quot;#TrEndDt&quot;).val(),
        }
    }

    function UpdateARMonthEndExportLink() {
        $(&quot;#ExportATBReportButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportATBReport' + '?enddate=' + encodeURIComponent($(&quot;#EndDateATB&quot;).val()));
    }

    function sendARMonthData() {
        var grid = $(&quot;#ARMonthEndGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, ARMonthEndDatevalue = $(&quot;#ARMonthEndDate&quot;).val();
            url = '/DRISDEV/PatientAccounting/ExportARMonthEndReport';

        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;ARMonthEndDate=&quot; + ARMonthEndDatevalue;
    }



                
            
                


    
       GL - Month End Report
    
    
            
                Select Month and Year
                
                    select
	jQuery(function(){jQuery(&quot;#MonthEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});

                
                
                    
                
            
        


            
            
                
    
       GL - Bad Debt Report
    
    
        
            System
            
                --Select--select
	jQuery(function(){jQuery(&quot;#System&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Allscripts_eCare&quot;,&quot;Value&quot;:&quot;Allscripts_eCare&quot;},{&quot;Text&quot;:&quot;Cerner&quot;,&quot;Value&quot;:&quot;Cerner&quot;},{&quot;Text&quot;:&quot;Paragon&quot;,&quot;Value&quot;:&quot;Paragon&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

            
            Facility
            
                --Select--select
	jQuery(function(){jQuery(&quot;#Facility&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Admission Type&quot;,&quot;Value&quot;:&quot;Admission Type&quot;},{&quot;Text&quot;:&quot;Assigned Patient Location&quot;,&quot;Value&quot;:&quot;Assigned Patient Location&quot;},{&quot;Text&quot;:&quot;Preadmit Number&quot;,&quot;Value&quot;:&quot;Preadmit Number&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

            
            FinancialClass
            
                --Select--select
	jQuery(function(){jQuery(&quot;#FinancialClass&quot;).kendoDropDownList({&quot;dataSource&quot;:[],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

            
        
        
            Cycle Name
            
                --Select--select
	jQuery(function(){jQuery(&quot;#BadDebtCycles&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;SPA1&quot;,&quot;Value&quot;:&quot;SPA1&quot;},{&quot;Text&quot;:&quot;SPA2&quot;,&quot;Value&quot;:&quot;SPA2&quot;},{&quot;Text&quot;:&quot;Test Cycle&quot;,&quot;Value&quot;:&quot;Test Cycle&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

            
            Cycle Step
            
                
	jQuery(function(){jQuery(&quot;#CycleStep&quot;).kendoNumericTextBox({&quot;format&quot;:&quot;n0&quot;,&quot;decimals&quot;:0});});

            
        
            
                
                    Search
                    Clear

                
            
            
    

         
            ExportSystemFacilityPatient NameInvoice NumberSSNGuarantor NameGuarantor AddressPatient TypePlan CodeAdmit DateDischarge DateBill DateLast Statement DateLast Payment DateWriteoff DatePayments ReceivedWriteoff AmountBad Debt Invoice Statusseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#BadDebtWriteOff&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:BadDebtWriteOffDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;SSN&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;SSN&quot;,&quot;data-title&quot;:&quot;SSN&quot;},&quot;field&quot;:&quot;SSN&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorName&quot;,&quot;data-title&quot;:&quot;Guarantor Name&quot;},&quot;field&quot;:&quot;GuarantorName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Address&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorAddress&quot;,&quot;data-title&quot;:&quot;Guarantor Address&quot;},&quot;field&quot;:&quot;GuarantorAddress&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PlanCode&quot;,&quot;data-title&quot;:&quot;Plan Code&quot;},&quot;field&quot;:&quot;PlanCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Admit Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdmitDate&quot;,&quot;data-title&quot;:&quot;Admit Date&quot;},&quot;field&quot;:&quot;AdmitDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Discharge Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DischargeDate&quot;,&quot;data-title&quot;:&quot;Discharge Date&quot;},&quot;field&quot;:&quot;DischargeDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Bill Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillDate&quot;,&quot;data-title&quot;:&quot;Bill Date&quot;},&quot;field&quot;:&quot;BillDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Last Statement Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;LastStatementDate&quot;,&quot;data-title&quot;:&quot;Last Statement Date&quot;},&quot;field&quot;:&quot;LastStatementDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Last Payment Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;LastPaymentDate&quot;,&quot;data-title&quot;:&quot;Last Payment Date&quot;},&quot;field&quot;:&quot;LastPaymentDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Writeoff Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;WriteoffDate&quot;,&quot;data-title&quot;:&quot;Writeoff Date&quot;},&quot;field&quot;:&quot;WriteoffDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Payments Received&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PaymentsReceived&quot;,&quot;data-title&quot;:&quot;Payments Received&quot;},&quot;field&quot;:&quot;PaymentsReceived&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Writeoff Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;WriteoffAmount&quot;,&quot;data-title&quot;:&quot;Writeoff Amount&quot;},&quot;field&quot;:&quot;WriteoffAmount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Bad Debt Invoice Status&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceStatus&quot;,&quot;data-title&quot;:&quot;Bad Debt Invoice Status&quot;},&quot;field&quot;:&quot;InvoiceStatus&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendBadDebtDataforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/BadDebtWriteOff_read&quot;,&quot;data&quot;:GetBadDebtCriteriaJson},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SSN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorAddress&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PlanCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;BillDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;LastStatementDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;LastPaymentDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;WriteoffDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PaymentsReceived&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;WriteoffAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceStatus&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Cycle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleStep&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Agency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;systemlist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;facilitylist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;financialclasslist&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;cyclelist&quot;:{&quot;type&quot;:&quot;object&quot;}}}}}});});
 
        
    
    $(function () {
        $(&quot;input&quot;).keypress(function (e) {
            if (e.which == 13) {
                Search1();
            }
        });
    });

    function Clear1() {
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        $(&quot;.field-validation-error&quot;).hide();

        $('#BadDebtSearchForm')[0].reset();
        $(&quot;#SearchResults1&quot;).hide();
    }

    function GetBadDebtCriteriaJson() {
        return { criteriaJson: JSON.stringify($('#BadDebtSearchForm').serializeObject()) };
    }

    function Search1() {
        $(&quot;#SearchResults1&quot;).hide();
        // $('#divValidationSummary').hide();
        //$('#listValidationErrors').empty();
        //var searchCriteriaValid = ValidateSearchCriteria();
        //if (!searchCriteriaValid) return;

        $(&quot;#SearchResults1&quot;).show();

        var grid = $('#BadDebtWriteOff').data('kendoGrid');
        grid.dataSource.read();

    }

    function sendBadDebtDataforExcel() {
        debugger;
        var criteriaJson = JSON.stringify($('#BadDebtSearchForm').serializeObject())
        var grid = $(&quot;#BadDebtWriteOff&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap;
        var url = '/DRISDEV/PatientAccounting/ExportBadDebtWriteOffReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;criteriaJson=&quot; + criteriaJson;

        }
        function BadDebtWriteOffDataBound(e) {
            AddTitleToGrid(e);
        }
    
            
                
                    

    
       GL - Annual MCR Report
    
    
        
            RA Start Date
            
                select
	jQuery(function(){jQuery(&quot;#AnnualMCFStartDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            RA End Date
            
                select
	jQuery(function(){jQuery(&quot;#AnnualMCFEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            
                
            
        
    


    ExportSystemPatient NamePatient Account NumberRA DateRA NumberDeductibleCoinsuranceseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#AnnualMCFReportGrid&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Patient Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;RA Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;RADate&quot;,&quot;data-title&quot;:&quot;RA Date&quot;},&quot;field&quot;:&quot;RADate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;RA Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;RANumber&quot;,&quot;data-title&quot;:&quot;RA Number&quot;},&quot;field&quot;:&quot;RANumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Deductible&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Deductible&quot;,&quot;data-title&quot;:&quot;Deductible&quot;},&quot;field&quot;:&quot;Deductible&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Coinsurance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Coinsurance&quot;,&quot;data-title&quot;:&quot;Coinsurance&quot;},&quot;field&quot;:&quot;Coinsurance&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendAnnualMCFData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/AnnualMCFReport_read&quot;,&quot;data&quot;:AnnualMCFData},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;Claims835File&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;Claims835ID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RADate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;RANumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Deductible&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Coinsurance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;}}}}}});});





    function GetAnnualMCFReportGridData() {
        $(&quot;#AnnualMCFResults&quot;).hide();
        $(&quot;#AnnualMCFResults&quot;).show();
        $('#AnnualMCFReportGrid').data('kendoGrid').dataSource.read();
    }

    function AnnualMCFData() {

        return {
            startdate: $(&quot;#AnnualMCFStartDate&quot;).val(),
            enddate: $(&quot;#AnnualMCFEndDate&quot;).val(),
        }
    }

    function sendAnnualMCFData() {
        debugger;
        var grid = $(&quot;#AnnualMCFReportGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, startdate = $(&quot;#AnnualMCFStartDate&quot;).val(), enddate = $(&quot;#AnnualMCFEndDate&quot;).val();
        url = '/DRISDEV/PatientAccounting/ExportAnnualMCFReport';


        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdate + &quot;&amp;enddate=&quot; + enddate;
    }




                
                            
                    


    
        GL - Account Detail Report
    
    
        
            Start Date
            
                select
	jQuery(function(){jQuery(&quot;#AccountDetailReportStartDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateTransactionExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            End Date
            
                select
	jQuery(function(){jQuery(&quot;#AccountDetailReportEndDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateTransactionExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            
                
            
        
    


        ExportSystemPatient NamePatient Account NumberPatient Primary Financial ClassPatient InsurancePatient Secondary Financial ClassPatient Secondary InsuranceAdmit DateDischarge DateDate Of First Bill To Patientseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#AccountDetailReportGrid&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Patient Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Primary Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PrimaryFinancialClass&quot;,&quot;data-title&quot;:&quot;Patient Primary Financial Class&quot;},&quot;field&quot;:&quot;PrimaryFinancialClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Insurance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PrimaryInsurance&quot;,&quot;data-title&quot;:&quot;Patient Insurance&quot;},&quot;field&quot;:&quot;PrimaryInsurance&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Secondary Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;SecondaryFinancialClass&quot;,&quot;data-title&quot;:&quot;Patient Secondary Financial Class&quot;},&quot;field&quot;:&quot;SecondaryFinancialClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Secondary Insurance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;SecondaryInsurance&quot;,&quot;data-title&quot;:&quot;Patient Secondary Insurance&quot;},&quot;field&quot;:&quot;SecondaryInsurance&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Admit Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdmitDate&quot;,&quot;data-title&quot;:&quot;Admit Date&quot;},&quot;field&quot;:&quot;AdmitDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Discharge Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DischargeDate&quot;,&quot;data-title&quot;:&quot;Discharge Date&quot;},&quot;field&quot;:&quot;DischargeDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Date Of First Bill To Patient&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DateOfFirstBill&quot;,&quot;data-title&quot;:&quot;Date Of First Bill To Patient&quot;},&quot;field&quot;:&quot;DateOfFirstBill&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;excel&quot;:{&quot;allPages&quot;:true},&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendAccountDetailData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/AccountDetailReport_read&quot;,&quot;data&quot;:AccountDetailData},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PrimaryFinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PrimaryInsurance&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SecondaryFinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SecondaryInsurance&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DateOfFirstBill&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null}}}}}});});

    

    function GetAccountDetailReportGridData() {
        $(&quot;#AccountDetailResults&quot;).hide();
        $(&quot;#AccountDetailResults&quot;).show();
        $('#AccountDetailReportGrid').data('kendoGrid').dataSource.read();
    }

    function AccountDetailData() {

        return {
            AccountDetailReportStartDate: $(&quot;#AccountDetailReportStartDate&quot;).val(),
            AccountDetailReportEndDate: $(&quot;#AccountDetailReportEndDate&quot;).val(),
        }
    }

    function sendAccountDetailData() {
        debugger;
        var grid = $(&quot;#AccountDetailReportGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, AccountDetailReportStartDatevalue = $(&quot;#AccountDetailReportStartDate&quot;).val(), AccountDetailReportEndDatevalue = $(&quot;#AccountDetailReportEndDate&quot;).val();
            url = '/DRISDEV/PatientAccounting/ExportAccountDetailReport';


        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;AccountDetailReportStartDate=&quot; + AccountDetailReportStartDatevalue + &quot;&amp;AccountDetailReportEndDate=&quot; + AccountDetailReportEndDatevalue;
    }




                
                            
                    

    
        GL - Monthly Transaction Report
    
    
        
            Post Start Date
            
                select
	jQuery(function(){jQuery(&quot;#MonthlyTrStartDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateMonthlyTransactionExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            Post End Date
            
                select
	jQuery(function(){jQuery(&quot;#MonthlyTrEndDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateMonthlyTransactionExportLink,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
			System
            
                --Select--select
	jQuery(function(){jQuery(&quot;#SystemDropdownList&quot;).kendoDropDownList({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Allscripts_eCare&quot;,&quot;Value&quot;:&quot;Allscripts_eCare&quot;},{&quot;Text&quot;:&quot;Cerner&quot;,&quot;Value&quot;:&quot;Cerner&quot;},{&quot;Text&quot;:&quot;Paragon&quot;,&quot;Value&quot;:&quot;Paragon&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;--Select--&quot;});});

             
            
                
            
        
    


        ExportIDSystemTransaction DateTransaction TypePay CodeDescriptionAmountseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#MonthlyTransactionReport&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ID&quot;,&quot;data-title&quot;:&quot;ID&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Transaction Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionDate&quot;,&quot;data-title&quot;:&quot;Transaction Date&quot;},&quot;field&quot;:&quot;TransactionDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Transaction Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionType&quot;,&quot;data-title&quot;:&quot;Transaction Type&quot;},&quot;field&quot;:&quot;TransactionType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Pay Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CPTCode&quot;,&quot;data-title&quot;:&quot;Pay Code&quot;},&quot;field&quot;:&quot;CPTCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdjustmentDescription&quot;,&quot;data-title&quot;:&quot;Description&quot;},&quot;field&quot;:&quot;AdjustmentDescription&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendmonthlytransactionData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/MonthlyTransactionSummaryReport_read&quot;,&quot;data&quot;:MonthlytransAdditionalInfo},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;TransactionDate&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientLastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientFirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GurantorFirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GurantorLastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ReferenceNumber&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PerformingDoctor&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ReferringDoctor&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ProcessCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Balance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CurrentBalance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CPTCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Modifiers&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PaymentType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CheckNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Agency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BatchAgency&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;BatchFacility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BatchNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TransactionDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;AdjustmentDescription&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});

    


    $(document).ready(function () {

       // UpdateGridSource();

    });

        function MonthlytransAdditionalInfo() {
            //debugger;
            return {
                startdate: $(&quot;#MonthlyTrStartDate&quot;).val(),
                enddate: $(&quot;#MonthlyTrEndDate&quot;).val(),
				system: $(&quot;#SystemDropdownList&quot;).data(&quot;kendoDropDownList&quot;).value()
            }
    }



    function UpdateMonthlyTransactionGridSource()
        {
        $(&quot;#monthlyResults3&quot;).hide();
        $(&quot;#monthlyResults3&quot;).show();
        //debugger;
        //$('#TransactionReport').data('kendoGrid').dataSource.read.data = transAdditionalInfo();
        $('#MonthlyTransactionReport').data('kendoGrid').dataSource.read();
        //$('#TransactionReport').data('kendoGrid').refresh();
    }


    function UpdateMonthlyTransactionExportLink() {
        $(&quot;#ExportTransactionsButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportTransactionSummary' + '?enddate=' + encodeURIComponent($(&quot;#MonthlyTrEndDate&quot;).val()) + '&amp;startdate=' + encodeURIComponent($(&quot;#MonthlyTrStartDate&quot;).val()));
    }
    function sendmonthlytransactionData(_data) {
        debugger;
         var grid = $(&quot;#MonthlyTransactionReport&quot;).data(&quot;kendoGrid&quot;),
             parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#MonthlyTrStartDate&quot;).val();
         parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#MonthlyTrEndDate&quot;).val();
		 systemvalue = $(&quot;#SystemDropdownList&quot;).data(&quot;kendoDropDownList&quot;).value();
            url = '/DRISDEV/PatientAccounting/ExportMonthlyTransactionSummary';


        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
         }
         window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue + &quot;&amp;system=&quot; + systemvalue;

    }



                
            
                



    
        Workflow - Transaction Usage Report
    
    
        
            Select Month and Year
            
                select
	jQuery(function(){jQuery(&quot;#ReportStartDate&quot;).kendoDatePicker({&quot;change&quot;:UpdateUsageExportLink,&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});

            
            Type
            
                Pay/Adjselect
	jQuery(function(){jQuery(&quot;#ddlReportType&quot;).kendoDropDownList({&quot;change&quot;:change,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Pay/Adj&quot;,&quot;Value&quot;:&quot;1&quot;},{&quot;Text&quot;:&quot;Revenue&quot;,&quot;Value&quot;:&quot;2&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;});});

            
            
                
            
        
    


        ExportGenerate ReportTransaction CodeTransaction DescriptionFacilityDepartmentPayor ClassPatient CategoryPatient Typeseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#PaymentUsageByChargeCode&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:PaymentUsageByChargeCodeDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;Transaction Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayCode&quot;,&quot;data-title&quot;:&quot;Transaction Code&quot;},&quot;field&quot;:&quot;PayCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Transaction Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayCodeDescription&quot;,&quot;data-title&quot;:&quot;Transaction Description&quot;},&quot;field&quot;:&quot;PayCodeDescription&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Department&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Department&quot;,&quot;data-title&quot;:&quot;Department&quot;},&quot;field&quot;:&quot;Department&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Payor Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayerClass&quot;,&quot;data-title&quot;:&quot;Payor Class&quot;},&quot;field&quot;:&quot;PayerClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Category&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientCategory&quot;,&quot;data-title&quot;:&quot;Patient Category&quot;},&quot;field&quot;:&quot;PatientCategory&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientType&quot;,&quot;data-title&quot;:&quot;Patient Type&quot;},&quot;field&quot;:&quot;PatientType&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendusageDataforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;UsageParameters()\&quot; id=\&quot;GenerateRevenueUsageReportButton\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/UsageReport_Read&quot;,&quot;data&quot;:ReturnDates},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ChargeCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayerClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayCodeDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientCategory&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Count&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;MonthCount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;MonthAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;YearCount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;YearAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PostDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Quantity&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;DepartmentPercent&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ChargeAdjustment&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ChargePayment&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null}}}}}});});

    
    
        ExportGenerate ReportPayor ClassFacilityCountAmountseek-warrow-w1arrow-eseek-e15select152550100items per pageNo items to display
	jQuery(function(){jQuery(&quot;#RevenueUsageByPayorClass&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:RevenueUsageByPayorClassDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;Payor Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayorClass&quot;,&quot;data-title&quot;:&quot;Payor Class&quot;},&quot;field&quot;:&quot;PayorClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Count&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Count&quot;,&quot;data-title&quot;:&quot;Count&quot;},&quot;field&quot;:&quot;Count&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100],&quot;buttonCount&quot;:10},&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendusageDataforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;},{&quot;name&quot;:null,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/RevenueUsageByPayorClass_read&quot;,&quot;data&quot;:ReturnDates},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;PayorClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Count&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;DepartmentPercent&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null}}}}}});});

    


    function change() {
        var val = $(&quot;#ddlReportType&quot;).val();
        if (val == &quot;1&quot;) {
            $('#PaymentUsageByChargeCodediv').show();
            $('#RevenueUsageByPayorClassdiv').hide();
        }
        else if (val == &quot;2&quot;) {
            $('#RevenueUsageByPayorClassdiv').show();
            $('#PaymentUsageByChargeCodediv').hide();
        }
        else {
            //alert(&quot;something went wrong&quot;);
        }
    };

    $(document).ready(function () {

        $(&quot;#RevenueUsageByPayorClassdiv&quot;).hide();

    });

    function ReturnDates() {

        return {
            startdate: $(&quot;#ReportStartDate&quot;).val(),
        }
    }

    function UpdateUsageExportLink() {
        var val = $(&quot;#ddlReportType&quot;).val();
        if (val == &quot;1&quot;) {
            $(&quot;#ExportRevenueUsageReportButton&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportRevenueUsageReport' + '?startdate=' + encodeURIComponent($(&quot;#ReportStartDate&quot;).val()));
        }
    }
    function UsageParameters() {
        var val = $(&quot;#ddlReportType&quot;).val();
        if (val == &quot;1&quot;) {
            $(&quot;#GenerateRevenueUsageReportButton&quot;).attr('href', '/DRISDEV/Report/PaymentAdjByChargeCodeReport' + '?startdate=' + encodeURIComponent($(&quot;#ReportStartDate&quot;).val()));
        }
    }

    function UpdateGridSource1()
    {
        var val = $(&quot;#ddlReportType&quot;).val();
        if (val == &quot;1&quot;) {
            $(&quot;#PaymentUsageByChargeCodediv&quot;).hide();
            $('#PaymentUsageByChargeCodediv').show();
            $('#RevenueUsageByPayorClassdiv').hide();
        }
        else if (val == &quot;2&quot;) {
            $(&quot;#RevenueUsageByPayorClassdiv&quot;).hide();
            $('#RevenueUsageByPayorClassdiv').show();
            $('#PaymentUsageByChargeCodediv').hide();
        }
        else {
            //alert(&quot;something went wrong&quot;);
        }
        //if (RevenueUsageByPayorClassdiv)
        //{
        //    $(&quot;#RevenueUsageByPayorClassdiv&quot;).hide();
        //    $(&quot;#RevenueUsageByPayorClassdiv&quot;).show();
        //}
        //else
        //{
        //    $(&quot;#PaymentUsageByChargeCodediv&quot;).hide();
        //    $(&quot;#PaymentUsageByChargeCodediv&quot;).show();
        //}
        debugger;
        var val = $(&quot;#ddlReportType&quot;).val();
        if (val == &quot;1&quot;) {
            $('#PaymentUsageByChargeCode').data('kendoGrid').dataSource.read();
        }
        else
        {
            $('#RevenueUsageByPayorClass').data('kendoGrid').dataSource.read();
        }
    }

    function sendusageDataforExcel(value) {
        var val = $(&quot;#ddlReportType&quot;).val();
        var grid;
        var url;
       // debugger;
        if (val == &quot;1&quot;) {

            grid = $(&quot;#PaymentUsageByChargeCode&quot;).data(&quot;kendoGrid&quot;),
                parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#ReportStartDate&quot;).val();
        }
        else {

            grid = $(&quot;#RevenueUsageByPayorClass&quot;).data(&quot;kendoGrid&quot;),
                parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#ReportStartDate&quot;).val();
        }
        if (val == &quot;1&quot;) {
            url = '/DRISDEV/PatientAccounting/ExportPaymentUsageReport';
        }
        else {
            url = '/DRISDEV/PatientAccounting/ExportRevenueUsageReport';
        }
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + enddatevalue;

    }
    function PaymentUsageByChargeCodeDataBound(e) {
        AddTitleToGrid(e);
    }
    function RevenueUsageByPayorClassDataBound(e) {
        AddTitleToGrid(e);
    }

            

            


            
                
    
        
            Collection Status Report
        
        
                

                    System
                    
                        Allscripts_eCareCernerParagon--Select--
	jQuery(function(){jQuery(&quot;#Systems&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Allscripts_eCare&quot;,&quot;Value&quot;:&quot;Allscripts_eCare&quot;},{&quot;Text&quot;:&quot;Cerner&quot;,&quot;Value&quot;:&quot;Cerner&quot;},{&quot;Text&quot;:&quot;Paragon&quot;,&quot;Value&quot;:&quot;Paragon&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[]});});

                    
                    Facility
                    
                        223443--Select--
	jQuery(function(){jQuery(&quot;#Facilities&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;22&quot;,&quot;Value&quot;:&quot;22&quot;},{&quot;Text&quot;:&quot;34&quot;,&quot;Value&quot;:&quot;34&quot;},{&quot;Text&quot;:&quot;43&quot;,&quot;Value&quot;:&quot;43&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[]});});

                    
                    Financial Class
                    
                        Self PayOther Non-Federal ProgramPPOPOSEPOIndemnityHMO Medicare RiskDMOAutoBCBCChampusCommercialDisabilityFederal Employees ProgramHMOLiability MedicalMedicare Part AMedicare Part BMedicaidOther Federal ProgramTitle VVeterans Affairs PlanWorkers CompMutually DefinedMedicareManaged MedicareManaged Medicaid--Select--
	jQuery(function(){jQuery(&quot;#FinancialClassTypes&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Self Pay&quot;,&quot;Value&quot;:&quot;1&quot;},{&quot;Text&quot;:&quot;Other Non-Federal Program&quot;,&quot;Value&quot;:&quot;2&quot;},{&quot;Text&quot;:&quot;PPO&quot;,&quot;Value&quot;:&quot;3&quot;},{&quot;Text&quot;:&quot;POS&quot;,&quot;Value&quot;:&quot;4&quot;},{&quot;Text&quot;:&quot;EPO&quot;,&quot;Value&quot;:&quot;5&quot;},{&quot;Text&quot;:&quot;Indemnity&quot;,&quot;Value&quot;:&quot;6&quot;},{&quot;Text&quot;:&quot;HMO Medicare Risk&quot;,&quot;Value&quot;:&quot;7&quot;},{&quot;Text&quot;:&quot;DMO&quot;,&quot;Value&quot;:&quot;8&quot;},{&quot;Text&quot;:&quot;Auto&quot;,&quot;Value&quot;:&quot;9&quot;},{&quot;Text&quot;:&quot;BCBC&quot;,&quot;Value&quot;:&quot;10&quot;},{&quot;Text&quot;:&quot;Champus&quot;,&quot;Value&quot;:&quot;11&quot;},{&quot;Text&quot;:&quot;Commercial&quot;,&quot;Value&quot;:&quot;12&quot;},{&quot;Text&quot;:&quot;Disability&quot;,&quot;Value&quot;:&quot;13&quot;},{&quot;Text&quot;:&quot;Federal Employees Program&quot;,&quot;Value&quot;:&quot;14&quot;},{&quot;Text&quot;:&quot;HMO&quot;,&quot;Value&quot;:&quot;15&quot;},{&quot;Text&quot;:&quot;Liability Medical&quot;,&quot;Value&quot;:&quot;16&quot;},{&quot;Text&quot;:&quot;Medicare Part A&quot;,&quot;Value&quot;:&quot;17&quot;},{&quot;Text&quot;:&quot;Medicare Part B&quot;,&quot;Value&quot;:&quot;18&quot;},{&quot;Text&quot;:&quot;Medicaid&quot;,&quot;Value&quot;:&quot;19&quot;},{&quot;Text&quot;:&quot;Other Federal Program&quot;,&quot;Value&quot;:&quot;20&quot;},{&quot;Text&quot;:&quot;Title V&quot;,&quot;Value&quot;:&quot;21&quot;},{&quot;Text&quot;:&quot;Veterans Affairs Plan&quot;,&quot;Value&quot;:&quot;22&quot;},{&quot;Text&quot;:&quot;Workers Comp&quot;,&quot;Value&quot;:&quot;23&quot;},{&quot;Text&quot;:&quot;Mutually Defined&quot;,&quot;Value&quot;:&quot;24&quot;},{&quot;Text&quot;:&quot;Medicare&quot;,&quot;Value&quot;:&quot;25&quot;},{&quot;Text&quot;:&quot;Managed Medicare&quot;,&quot;Value&quot;:&quot;26&quot;},{&quot;Text&quot;:&quot;Managed Medicaid&quot;,&quot;Value&quot;:&quot;27&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[]});});

                    
                
                
                    Time Period
                    
                        
                        Last 12 Months--Select--
	jQuery(function(){jQuery(&quot;#TimePeriods&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Last 12 Months&quot;,&quot;Value&quot;:&quot;Last12Month&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[]});});

                    

                    Division
                    
                        CardiologyHematology--Select--
	jQuery(function(){jQuery(&quot;#Divisions&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Cardiology&quot;,&quot;Value&quot;:&quot;Cardiology&quot;},{&quot;Text&quot;:&quot;Hematology&quot;,&quot;Value&quot;:&quot;Hematology&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[]});});

                    
                    Group
                    
                        1234--Select--
	jQuery(function(){jQuery(&quot;#Groups&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;1&quot;,&quot;Value&quot;:&quot;1&quot;},{&quot;Text&quot;:&quot;2&quot;,&quot;Value&quot;:&quot;2&quot;},{&quot;Text&quot;:&quot;3&quot;,&quot;Value&quot;:&quot;3&quot;},{&quot;Text&quot;:&quot;4&quot;,&quot;Value&quot;:&quot;4&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[]});});

                    
                
                
                    
                        
                            
                                
                                    
                                
                                Export
                                Clear
                                
                            
                        
                    
                
        
    




    function IsCSRFormValid123(CSRForm) {
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        var isValid = false;
        
        var IsSystemSelected = $(CSRForm).find(&quot;#Systems&quot;).val() != null;
        var IsFacilitySelected = $(CSRForm).find(&quot;#Facilities&quot;).val() != null;
        var IsSystemSelected = $(CSRForm).find(&quot;#FinancialClasses&quot;).val() != null;
        var IsTimePeriodSelected = $(CSRForm).find(&quot;#TimePeriods&quot;).val() != null;
        var IsDivisionSelected = $(CSRForm).find(&quot;#Divisions&quot;).val() != null;
        var IsGroupSelected = $(CSRForm).find(&quot;#Groups&quot;).val() != null;
        isValid = IsTimePeriodSelected;
        var InvalidFieldsMsg = &quot;&lt;li class='list-group-item'>Time Period&lt;/li>&quot;;
        if (!isValid) {
            var Header = &quot;Please Select minimum search criteria listed below : &quot;;
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; + InvalidFieldsMsg + &quot;&lt;/ul>&quot;);
            $(&quot;#divValidationSummaryCSReport&quot;).html($('#divValidationSummary'));
            $(&quot;#divValidationSummaryCSReport&quot;).find('#validationSummaryTitle').first().text(Header);
            $('#divValidationSummary').show();
            return isValid;
        }
        isValid = $(CSRForm).valid();
        return isValid;   
    }
    function SubmitForm123(elem) {
        var CSRForm = $(elem).parents(&quot;form&quot;).first();
        if (IsCSRFormValid123(CSRForm))
            $(CSRForm).submit();
        else
            return false;
    }
    function clearCSReportForm() {
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
    }



            

            
                


    
        
            Income Analysis Report
        
        
            
                GLMonth
                
                    select
	jQuery(function(){jQuery(&quot;#StartDateReport&quot;).kendoDatePicker({&quot;change&quot;:UpdateExportLinkCredit,&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});


                
                
                    

                
                
                    
                
            
        
    

    


        Generate ReportSystemFacilityGroupPrimary DiagnosisProviderLocationseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#IncomeAnalysisReport&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=Invoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Facility&quot;,&quot;data-title&quot;:&quot;Facility&quot;},&quot;field&quot;:&quot;Facility&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=Invoice\u0026column=Facility&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=Invoice\u0026column=Group&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Primary Diagnosis&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdmitDiagnosis&quot;,&quot;data-title&quot;:&quot;Primary Diagnosis&quot;},&quot;field&quot;:&quot;AdmitDiagnosis&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=Invoice\u0026column=AdmitDiagnosis&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Provider&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Provider&quot;,&quot;data-title&quot;:&quot;Provider&quot;},&quot;field&quot;:&quot;Provider&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=Invoice\u0026column=Provider&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Location&quot;,&quot;data-title&quot;:&quot;Location&quot;},&quot;field&quot;:&quot;Location&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=Invoice\u0026column=Location&quot;}}}},&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendIncomeAnalysisReportforPDF()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/IncomeAnalysisReport_read&quot;,&quot;data&quot;:additionalInfoforgridIncomeAnalysis},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;Group&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Provider&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AdmitDiagnosis&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});

    





    function ValidateSearchCriteriaIncome() {
        debugger
        var isValid = false;

        if ($('#StartDateReport').val() !== '') isValid = true;
        var InvalidFieldsMsg = &quot;&lt;li class='list-group-item'>Start Date&lt;/li>&quot;;
        if (!isValid) {
            var Header = &quot;Please Select minimum search criteria listed below : &quot;;
            //$('#validationSummaryTitle').text('Please enter the minimum criteria listed below');
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; + InvalidFieldsMsg + &quot;&lt;/ul>&quot;);
            $(&quot;#divValidationSummaryIncome&quot;).html($('#divValidationSummary'));
            $(&quot;#divValidationSummaryIncome&quot;).find('#validationSummaryTitle').first().text(Header);
            $('#divValidationSummary').show();
            
            return isValid;
        }
        return isValid;
    }
     
    function additionalInfoforgridIncomeAnalysis() {
        return {
            enddate: $(&quot;#StartDateReport&quot;).val(),
        }
    }
    function sendIncomeAnalysisReportforPDF() {
        var grid = $(&quot;#IncomeAnalysisReport&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#StartDateReport&quot;).val();
        var url = '/DRISDEV/PatientAccounting/IncomeAnalysisReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;
    }



    function IncomeReportSearch() {
        $(&quot;#incomeAnalysisReport&quot;).hide();
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        var isValid = ValidateSearchCriteriaIncome();
        if (isValid) {
            $(&quot;#incomeAnalysisReport&quot;).show();
            $('#IncomeAnalysisReport').data('kendoGrid').dataSource.read();
        }
    }
   





            
            
                

    
        
            Aged Trial Balance Summary Report
        
        
            
                Month
                
                    select
	jQuery(function(){jQuery(&quot;#enddate&quot;).kendoDatePicker({&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});


                
                System
                
                    Allscripts_eCareCernerParagon--Select--
	jQuery(function(){jQuery(&quot;#systems&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Allscripts_eCare&quot;,&quot;Value&quot;:&quot;Allscripts_eCare&quot;},{&quot;Text&quot;:&quot;Cerner&quot;,&quot;Value&quot;:&quot;Cerner&quot;},{&quot;Text&quot;:&quot;Paragon&quot;,&quot;Value&quot;:&quot;Paragon&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;--Select--&quot;,&quot;value&quot;:[{&quot;Disabled&quot;:false,&quot;Group&quot;:null,&quot;Selected&quot;:false,&quot;Text&quot;:&quot;Allscripts_eCare&quot;,&quot;Value&quot;:null},{&quot;Disabled&quot;:false,&quot;Group&quot;:null,&quot;Selected&quot;:false,&quot;Text&quot;:&quot;Cerner&quot;,&quot;Value&quot;:null},{&quot;Disabled&quot;:false,&quot;Group&quot;:null,&quot;Selected&quot;:false,&quot;Text&quot;:&quot;Paragon&quot;,&quot;Value&quot;:null}]});});

                    
                
                
                    
                
                
                    
                
            
        
    




    function SubmitATBSummary() {
        //$(&quot;#incomeAnalysisReport&quot;).hide();
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();

        var isValid = ValidateSearchCriteriaATBSummary()
        if (isValid) {
            $('#ATBSummaryReportForm').submit();
        }
    }

    function ValidateSearchCriteriaATBSummary() {
        var isValid = false;

        if ($('#enddate').val() !== '' &amp;&amp; $('#systems').val() !== '' &amp;&amp; $('#systems').val() !== null) isValid = true;
        var InvalidFieldsMsg = &quot;&lt;li class='list-group-item'>Start Date&lt;/li>&quot; + &quot;&lt;li class='list-group-item'>Systems&lt;/li>&quot;;
        if (!isValid) {
            var Header = &quot;Please Select minimum search criteria listed below : &quot;;
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; + InvalidFieldsMsg + &quot;&lt;/ul>&quot;);
            $(&quot;#divValidationSummaryATBSummary&quot;).html($('#divValidationSummary'));
            $(&quot;#divValidationSummaryATBSummary&quot;).find('#validationSummaryTitle').first().text(Header);
            $('#divValidationSummary').show();

            return isValid;
        }
        return isValid;
    }
    
    
            
            
                

    
        
            Activity Detail Report
        
        
            
                Start Date
                
                    select
	jQuery(function(){jQuery(&quot;#PRStartDate&quot;).kendoDatePicker({&quot;change&quot;:changeProdDetailEndDate,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                
                End Date
                
                    select
	jQuery(function(){jQuery(&quot;#PREndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                
                
                    
                
                
                    
                
            
        
    



    ExportSystemDateUser NameTimeActivity TypeActivity NameSummaryPatient NameAccount NumberInvoice NumberGuarantor NameGuarantor IDInvoice Current PlanInvoice FCLinked AmountInvoice Balanceseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#ProductivityReport&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=VisitEventLog\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EventDate&quot;,&quot;data-title&quot;:&quot;Date&quot;},&quot;field&quot;:&quot;EventDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;User Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;UserID&quot;,&quot;data-title&quot;:&quot;User Name&quot;},&quot;field&quot;:&quot;UserID&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=VisitEventLog\u0026column=UserID&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Time&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Time&quot;,&quot;data-title&quot;:&quot;Time&quot;},&quot;field&quot;:&quot;Time&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Activity Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EventType&quot;,&quot;data-title&quot;:&quot;Activity Type&quot;},&quot;field&quot;:&quot;EventType&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=VisitEventLog\u0026column=EventType&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Activity Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EventCodeDescription&quot;,&quot;data-title&quot;:&quot;Activity Name&quot;},&quot;field&quot;:&quot;EventCodeDescription&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Summary&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EventDescription&quot;,&quot;data-title&quot;:&quot;Summary&quot;},&quot;field&quot;:&quot;EventDescription&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;PatientName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorName&quot;,&quot;data-title&quot;:&quot;Guarantor Name&quot;},&quot;field&quot;:&quot;GuarantorName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Guarantor ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorID&quot;,&quot;data-title&quot;:&quot;Guarantor ID&quot;},&quot;field&quot;:&quot;GuarantorID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceCurrentPlan&quot;,&quot;data-title&quot;:&quot;Invoice Current Plan&quot;},&quot;field&quot;:&quot;InvoiceCurrentPlan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice FC&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceFC&quot;,&quot;data-title&quot;:&quot;Invoice FC&quot;},&quot;field&quot;:&quot;InvoiceFC&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Linked Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;LinkedAmount&quot;,&quot;data-title&quot;:&quot;Linked Amount&quot;},&quot;field&quot;:&quot;LinkedAmount&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceBalance&quot;,&quot;data-title&quot;:&quot;Invoice Balance&quot;},&quot;field&quot;:&quot;InvoiceBalance&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendproductivityReportData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/ProductivityReport_read&quot;,&quot;data&quot;:prAdditionalInfo},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;UserID&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EventDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;UserID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Time&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EventType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EventCodeDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EventDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceCurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceFC&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LinkedAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceBalance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null}}}}}});});






    function UpdatePRGridSource() {
        $(&quot;#productivityReport&quot;).hide();
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        var isValid = ValidateSearchCriteriaProductivity();
        
        if (isValid) {
            $(&quot;#productivityReport&quot;).show();
            $('#ProductivityReport').data('kendoGrid').dataSource.read();
        }
    }

    function changeProdDetailEndDate(e) {
        var endDate = new Date(this.value());
        endDate.setDate(this.value().getDate() + 6);
        var datepicker = $(&quot;#PREndDate&quot;).data(&quot;kendoDatePicker&quot;);
        datepicker.value(endDate);
        datepicker.trigger(&quot;change&quot;);
    } 

    function prAdditionalInfo() {
        return {
            startdate: $(&quot;#PRStartDate&quot;).val(),
            enddate: $(&quot;#PREndDate&quot;).val(),
        }
    }

    function ValidateSearchCriteriaProductivity() {
        var isValid = false;

        if ($('#PRStartDate').val() !== '') isValid = true;
        var InvalidFieldsMsg = &quot;&lt;li class='list-group-item'>Start Date&lt;/li>&quot;;
        if (!isValid) {
            var Header = &quot;Please Select minimum search criteria listed below : &quot;;
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; + InvalidFieldsMsg + &quot;&lt;/ul>&quot;);
            $(&quot;#divValidationSummaryProd&quot;).html($('#divValidationSummary'));
            $(&quot;#divValidationSummaryProd&quot;).find('#validationSummaryTitle').first().text(Header);
            $('#divValidationSummary').show();
            return isValid;
        }
        return isValid;
    }

    function sendproductivityReportData() {    
        var grid = $(&quot;#ProductivityReport&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#PRStartDate&quot;).val();
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#PREndDate&quot;).val();
            var url = '/DRISDEV/PatientAccounting/ExportProductivityReport';

        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
         }
         window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue;

    }







            

            
                

    
        
           Activity Summary Report
        
        
                
                    Start Date
                    
                        select
	jQuery(function(){jQuery(&quot;#PSStartDate&quot;).kendoDatePicker({&quot;change&quot;:changeEndDate,&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                    
                    End Date
                    
                        select
	jQuery(function(){jQuery(&quot;#PSEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                    
                    
                        
                    
                    
                        
                    
                
        
    



    Generate ReportActivity NameActivity Typeseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#ProductivitySummaryReport&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;columns&quot;:[{&quot;title&quot;:&quot;Activity Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EventCodeDescription&quot;,&quot;data-title&quot;:&quot;Activity Name&quot;},&quot;field&quot;:&quot;EventCodeDescription&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=VisitEventLog\u0026column=EventCodeDescription&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Activity Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EventType&quot;,&quot;data-title&quot;:&quot;Activity Type&quot;},&quot;field&quot;:&quot;EventType&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetReportFilter?table=VisitEventLog\u0026column=EventType&quot;}}}},&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendproductivitySummaryReportData()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Generate Report&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/ProductivitySummaryReport_read&quot;,&quot;data&quot;:prAdditionalInfoSummary},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;EventType&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;EventCodeDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EventType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EventDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null}}}}}});});






    function changeEndDate(e) {
        debugger;
        var endDate = new Date(this.value());
        endDate.setDate(this.value().getDate() + 6);
        var datepicker = $(&quot;#PSEndDate&quot;).data(&quot;kendoDatePicker&quot;);
        datepicker.value(endDate);
        datepicker.trigger(&quot;change&quot;);
    } 
    function UpdatePSGridSource() {
        $(&quot;#productivitySummaryReport&quot;).hide();
        $('#divValidationSummary').hide();
        $('#listValidationErrors').empty();
        var isValid = ValidateSearchCriteriaProductivitySummary();

        if (isValid) {
            $(&quot;#productivitySummaryReport&quot;).show();
            $('#ProductivitySummaryReport').data('kendoGrid').dataSource.read();
        }
    }

    function prAdditionalInfoSummary() {
        //debugger;
        return {
            startdate: $(&quot;#PSStartDate&quot;).val(),
            enddate: $(&quot;#PSEndDate&quot;).val(),
        }
    }

    function ValidateSearchCriteriaProductivitySummary() {

        var isValid = false;

        if ($('#PSStartDate').val() !== '' &amp;&amp; $('#PSEndDate').val() !== '') isValid = true;
        var InvalidFieldsMsg = &quot;&lt;li class='list-group-item'>Start Date&lt;/li>&quot;;
        if (!isValid) {

            var Header = &quot;Please Select minimum search criteria listed below : &quot;;
            $('#listValidationErrors').append(&quot;&lt;ul class='list-group list-group-flush'>&quot; + InvalidFieldsMsg + &quot;&lt;/ul>&quot;);
            $(&quot;#divValidationSummaryProdReport&quot;).html($('#divValidationSummary'));
            $(&quot;#divValidationSummaryProdReport&quot;).find('#validationSummaryTitle').first().text(Header);
            $('#divValidationSummary').show();
            return isValid;
        }
        return isValid;
    }
    
    function sendproductivitySummaryReportData() {
        var grid = $(&quot;#ProductivitySummaryReport&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, startdatevalue = $(&quot;#PSStartDate&quot;).val();
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#PSEndDate&quot;).val();
            var url = '';

            url = '/DRISDEV/Report/ProductivitySummaryReport';
    
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
         }
         window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdatevalue + &quot;&amp;enddate=&quot; + enddatevalue;

    }








            



            
                


    
        Credit - Credit Report
    
    
        
            Select Date
            
                select
	jQuery(function(){jQuery(&quot;#EndDateCredit&quot;).kendoDatePicker({&quot;change&quot;:UpdateExportLinkCredit,&quot;format&quot;:&quot;MMMM yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2020,6,31,0,0,0,0),&quot;depth&quot;:&quot;year&quot;,&quot;start&quot;:&quot;year&quot;});});

            
            
                
            
        
    

    


        ExportInvoice IDSystemGroupPatient NameMRNCurrent PlanAccount NumberInvoice NumberBalanceService DateFinancial ClassAgency Nameseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#CreditReport&quot;).kendoGrid({&quot;filterMenuInit&quot;:GridFilterMenuInit,&quot;dataBound&quot;:CreditReportDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;Invoice ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceID&quot;,&quot;data-title&quot;:&quot;Invoice ID&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;InvoiceID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetSystemFilter?table=OpenARInvoice\u0026column=System&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Group&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Group&quot;,&quot;data-title&quot;:&quot;Group&quot;},&quot;field&quot;:&quot;Group&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetGroupFilter?table=OpenARInvoice\u0026column=Group&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GuarantorName&quot;,&quot;data-title&quot;:&quot;Patient Name&quot;},&quot;field&quot;:&quot;GuarantorName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;MRN&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;MRN&quot;,&quot;data-title&quot;:&quot;MRN&quot;},&quot;field&quot;:&quot;MRN&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Current Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CurrentPlan&quot;,&quot;data-title&quot;:&quot;Current Plan&quot;},&quot;field&quot;:&quot;CurrentPlan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BalanceCalc&quot;,&quot;data-title&quot;:&quot;Balance&quot;},&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Service Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ServiceFromDate&quot;,&quot;data-title&quot;:&quot;Service Date&quot;},&quot;field&quot;:&quot;ServiceFromDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;FinancialClass&quot;,&quot;filterable&quot;:{&quot;multi&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/GetGroupFilter?table=OpenARInvoice\u0026column=FinancialClass&quot;}}}},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Agency Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AgencyName&quot;,&quot;data-title&quot;:&quot;Agency Name&quot;},&quot;field&quot;:&quot;AgencyName&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendCreditforExcel()\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/CreditReport_read&quot;,&quot;data&quot;:additionalInfoforgridCredit},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;BalanceCalc&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ReportDate&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;InvoiceID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Group&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MiddleName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceFromDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;ServiceThroughDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AttendingPhysicianName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Location&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;HospitalName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingArea&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;CurrentPlan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Charges&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BalanceCalc&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;IsMonthEnd&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;PatientCategory&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountStatus&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SubscriberNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FullName&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;ServiceCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Payments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Adjustments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Facility&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GuarantorName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PayorClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ServiceDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;FinancialClassTypeID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleStepID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CycleTaskID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UserID&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;AgencyName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AgentCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DOB&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceAgeInDays&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Cycle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleStep&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CycleTask&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UserName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CommentDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;Comment&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Balance&quot;:{&quot;type&quot;:&quot;number&quot;}}}}}});});

    

    //$(document).ready(function () {
    //    var today = new Date();
    //    var lastDay = new Date(today.getFullYear(), today.getMonth() + 1, 0);
    //    $('#EndDateCredit').kendoDatePicker({
    //        max: new Date(lastDay),
    //        start: &quot;year&quot;,
    //        depth: &quot;year&quot;,
    //        format: &quot;MMMM yyyy&quot;,
    //       dateInput: true
    //    });
    //})

    function additionalInfoforgridCredit() {
        return {
            enddate: $(&quot;#EndDateCredit&quot;).val(),
        }
    }
    function UpdateOpenARGridSourceCredit()
    {
        $(&quot;#creditResult&quot;).show();
        $('#CreditReport').data('kendoGrid').dataSource.read();
    }
    function UpdateExportLinkCredit() {
        $(&quot;#ExportOpenARButtonInvoice&quot;).attr('href', '/DRISDEV/PatientAccounting/ExportCreditReport' + '?enddate=' + encodeURIComponent($(&quot;#EndDateInvoice&quot;).val()));
    }
    function sendCreditforExcel() {
        var grid = $(&quot;#CreditReport&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap, enddatevalue = $(&quot;#EndDateCredit&quot;).val();
        var url = '/DRISDEV/PatientAccounting/ExportCreditReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;enddate=&quot; + enddatevalue;
    }
    function CreditReportDataBound(e) {
        AddTitleToGrid(e)
    }




            
            
                
                

    
        Physician Billing Detail Report
    
    
        
            Select Date Range
            
                ---Please Select---select
	jQuery(function(){jQuery(&quot;#DateType&quot;).kendoDropDownList({&quot;change&quot;:DateTypeSelected,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Admission Date&quot;,&quot;Value&quot;:&quot;AdmissionDate&quot;},{&quot;Text&quot;:&quot;Discharge Date&quot;,&quot;Value&quot;:&quot;DischargeDate&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;optionLabel&quot;:&quot;---Please Select---&quot;});});

            
        
        
            Admission Date From
            
                select
	jQuery(function(){jQuery(&quot;#AdmitStartDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            Admission Date To
            
                select
	jQuery(function(){jQuery(&quot;#AdmitEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
        
        
            Discharge Date From
            
                select
	jQuery(function(){jQuery(&quot;#DischargeStartDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            Discharge Date To
            
                select
	jQuery(function(){jQuery(&quot;#DischargeEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
        
        
        
            Select Type Of Physicians
            
                AdmittingBillingFace to FaceFamilyPerformingPost DischargeRecertifyingReferringSupervising...Select Physicians...
	jQuery(function(){jQuery(&quot;#TypesOfPhysician&quot;).kendoMultiSelect({&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Admitting&quot;,&quot;Value&quot;:&quot;Admitting&quot;},{&quot;Text&quot;:&quot;Billing&quot;,&quot;Value&quot;:&quot;Billing&quot;},{&quot;Text&quot;:&quot;Face to Face&quot;,&quot;Value&quot;:&quot;Face to Face&quot;},{&quot;Text&quot;:&quot;Family&quot;,&quot;Value&quot;:&quot;Family&quot;},{&quot;Text&quot;:&quot;Performing&quot;,&quot;Value&quot;:&quot;Performing&quot;},{&quot;Text&quot;:&quot;Post Discharge&quot;,&quot;Value&quot;:&quot;Post Discharge&quot;},{&quot;Text&quot;:&quot;Recertifying&quot;,&quot;Value&quot;:&quot;Recertifying&quot;},{&quot;Text&quot;:&quot;Referring&quot;,&quot;Value&quot;:&quot;Referring&quot;},{&quot;Text&quot;:&quot;Supervising&quot;,&quot;Value&quot;:&quot;Supervising&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;placeholder&quot;:&quot;...Select Physicians...&quot;,&quot;value&quot;:[]});});

            
        
        
            
                Filter
                
                
                    
                    
                        
                            
                            Please enter the minimum criteria listed below
                        
                        

                        
                    
                
            
        
        
            ExportSystemFacility LocationProvider NameNPITypeAccount NumberInvoice NumberAdmit DateDischarge DateChargeEncounter NumberPrimary PayerFinancial ClassTotal ChargesTotal PaymentsTotal AdjustmentInvoice Balanceseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#PhysicianBillingReportGRID&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;System&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;System&quot;,&quot;data-title&quot;:&quot;System&quot;},&quot;field&quot;:&quot;System&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Facility Location&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FacilityLocation&quot;,&quot;data-title&quot;:&quot;Facility Location&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;FacilityLocation&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Provider Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ProviderName&quot;,&quot;data-title&quot;:&quot;Provider Name&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;ProviderName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;NPI&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;NPI&quot;,&quot;data-title&quot;:&quot;NPI&quot;},&quot;field&quot;:&quot;NPI&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Type&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Type&quot;,&quot;data-title&quot;:&quot;Type&quot;},&quot;field&quot;:&quot;Type&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Account Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AccountNumber&quot;,&quot;data-title&quot;:&quot;Account Number&quot;},&quot;field&quot;:&quot;AccountNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceNumber&quot;,&quot;data-title&quot;:&quot;Invoice Number&quot;},&quot;field&quot;:&quot;InvoiceNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Admit Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;AdmitDate&quot;,&quot;data-title&quot;:&quot;Admit Date&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;AdmitDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Discharge Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DischargeDate&quot;,&quot;data-title&quot;:&quot;Discharge Date&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;DischargeDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charge&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;VisitService&quot;,&quot;data-title&quot;:&quot;Charge&quot;},&quot;field&quot;:&quot;VisitService&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Encounter Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;EncounterNumber&quot;,&quot;data-title&quot;:&quot;Encounter Number&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;EncounterNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Primary Payer&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PrimaryPayer&quot;,&quot;data-title&quot;:&quot;Primary Payer&quot;},&quot;field&quot;:&quot;PrimaryPayer&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Financial Class&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PrimaryFinancialClass&quot;,&quot;data-title&quot;:&quot;Financial Class&quot;},&quot;field&quot;:&quot;PrimaryFinancialClass&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Total Charges&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TotalCharges&quot;,&quot;data-title&quot;:&quot;Total Charges&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;TotalCharges&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Total Payments&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TotalPayments&quot;,&quot;data-title&quot;:&quot;Total Payments&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;TotalPayments&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Total Adjustment&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TotalAdjustments&quot;,&quot;data-title&quot;:&quot;Total Adjustment&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;TotalAdjustments&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;InvoiceBalance&quot;,&quot;data-title&quot;:&quot;Invoice Balance&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;InvoiceBalance&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;sendPhysicianBillingforExcel()\&quot; class=\&quot;border border-primary\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/PhysicianBilling_Read&quot;,&quot;data&quot;:GetParametersData},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;System&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FacilityLocation&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ProviderName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NPI&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Type&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccountNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;InvoiceNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AdmitDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DischargeDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;VisitService&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EncounterNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PrimaryPayer&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PrimaryFinancialClass&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TotalCharges&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TotalPayments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TotalAdjustments&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;InvoiceBalance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null}}}}}});});

        
    


    var selectedData = [];
    //Enter Button Functionality Starts From Here
    $(function () {
        $(&quot;input&quot;).keypress(function (e) {
            if (e.which == 13) {
                //debugger;
                UpdatePhysicianBillingSource();
            }
        });
    });
    
    //Max and Min Date validation
    function DateTypeSelected() {
        if ($('#DateType').val() == 'DischargeDate') {
            $('#DischargeDate').show();
            $('#AdmitDate').hide();
           // $('#DateTypeDiv').hide();
        }
        else if ($('#DateType').val() == 'AdmissionDate') {
            $('#DischargeDate').hide();
            $('#AdmitDate').show();
         //   $('#DateTypeDiv').hide();
        } else {
          //  $('#DateTypeDiv').show();
            $('#DischargeDate').hide();
            $('#AdmitDate').hide();
        }
    }

    //Get Parameter Data Functionality
    function GetParametersData() {
        return {
            DateType: $('#DateType').val(),
            startdate: $(&quot;#AdmitStartDate&quot;).val(),
            enddate: $(&quot;#AdmitEndDate&quot;).val(),
            TypesOfPhysician: selectedData
        }
    }
    //Filter Buttin Functionality
    function UpdatePhysicianBillingSource() {
        //debugger;
        var multiselect = $(&quot;#TypesOfPhysician&quot;).data(&quot;kendoMultiSelect&quot;);
        var items = multiselect.value();
        selectedData = [];
        for (var i = 0; i &lt; items.length; i++) {
            selectedData.push(items[i]);
        }
        var serachCriterialValidationCheck = ValidateSearchCriteriaFilter();
        if (serachCriterialValidationCheck) {
            $('#PhysicianBillingReportGRIDDiv').show();
            $('#PhysicianBillingReportGRID').data('kendoGrid').dataSource.read();
            $('#divValidationSummaryFilter').hide();
        }
    }

    //Search Criteria Validation functionality Starts from here
	 function ValidateSearchCriteriaFilter() {
		  var isValid = true;
		  if($('#DateType').val() == '')
		  { 
		    isValid = false;
			$('#listValidationErrorsFilters').html(&quot;&lt;ul class='list-group list-group-flush'>&lt;li class='list-group-item'>Date Type&lt;/li>&lt;/ul>&quot;);			
		  }
		  else if ($('#DateType').val() == 'AdmissionDate') {
				if ($('#AdmitStartDate').val() == '' || $('#AdmitEndDate').val() == '') {			
					isValid = false;
					$('#listValidationErrorsFilters').html(&quot;&lt;ul class='list-group list-group-flush'>&lt;li class='list-group-item'>Admission Date&lt;/li>&lt;/ul>&quot;);
				}
			} else if ($('#DateType').val() == 'DischargeDate') {
				if ($('#DischargeStartDate').val() == '' || $('#DischargeEndDate').val() == '') {
					isValid = false;
					$('#listValidationErrorsFilters').html(&quot;&lt;ul class='list-group list-group-flush'>&lt;li class='list-group-item'>Discharge Date&lt;/li>&lt;/ul>&quot;);
				}
        }		
		if(isValid==false)
		{
		   $('#divValidationSummaryFilter').show();
		}
		return isValid;
	 }

    ///
    function sendPhysicianBillingforExcel() {
        //debugger;
        var grid = $(&quot;#PhysicianBillingReportGRID&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap,
            DateType = $('#DateType').val(),
            startdate = $(&quot;#AdmitStartDate&quot;).val(),
            enddate = $(&quot;#AdmitEndDate&quot;).val(),
            TypesOfPhysician = selectedData;
        var url = '/DRISDEV/PatientAccounting/ExportPhysicianBillingReport';
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;DateType=&quot; + DateType + &quot;&amp;startdate=&quot; + startdate + &quot;&amp;enddate=&quot; + enddate + &quot;&amp;TypesOfPhysician=&quot; + TypesOfPhysician;
    }
    $(document).ready(function () {
        // AdmitStartDate  and AdmitEndDate Validation Logic
        var admitStartDate = $(&quot;#AdmitStartDate&quot;).kendoDatePicker({
            change: admitStartDateChange
        }).data(&quot;kendoDatePicker&quot;);

        var admitEndDate = $(&quot;#AdmitEndDate&quot;).kendoDatePicker({
            change: admitEndDateChange
        }).data(&quot;kendoDatePicker&quot;);

        admitStartDate.max(admitEndDate.value());
        admitEndDate.min(admitStartDate.value());

        function admitStartDateChange() {
            var startDate = admitStartDate.value(),
                endDate = admitEndDate.value();

            if (startDate) {
                startDate = new Date(startDate);
                startDate.setDate(startDate.getDate());
                admitEndDate.min(startDate);
            } else if (endDate) {
                admitStartDate.max(new Date(endDate));
            } else {
                endDate = new Date();
                admitStartDate.max(endDate);
                admitEndDate.min(endDate);
            }
        }

        function admitEndDateChange() {
            var endDate = admitEndDate.value(),
                startDate = admitStartDate.value();

            if (endDate) {
                endDate = new Date(endDate);
                endDate.setDate(endDate.getDate());
                admitStartDate.max(endDate);
            } else if (startDate) {
                admitEndDate.min(new Date(startDate));
            } else {
                endDate = new Date();
                admitStartDate.max(endDate);
                admitEndDate.min(endDate);
            }
        }

          // DischargeStartDate  and DischargeEndDate Validation Logic

        var dischargeStartDate = $(&quot;#DischargeStartDate&quot;).kendoDatePicker({
            change: dischargeStartDateChange
        }).data(&quot;kendoDatePicker&quot;);

        var dischargeEndDate = $(&quot;#DischargeEndDate&quot;).kendoDatePicker({
            change: dischargeEndDateChange
        }).data(&quot;kendoDatePicker&quot;);

        dischargeStartDate.max(dischargeEndDate.value());
        dischargeEndDate.min(dischargeStartDate.value());

        function dischargeStartDateChange() {
            var startDate = dischargeStartDate.value(),
                endDate = dischargeEndDate.value();

            if (startDate) {
                startDate = new Date(startDate);
                startDate.setDate(startDate.getDate());
                dischargeEndDate.min(startDate);
            } else if (endDate) {
                dischargeStartDate.max(new Date(endDate));
            } else {
                endDate = new Date();
                dischargeStartDate.max(endDate);
                dischargeEndDate.min(endDate);
            }
        }

        function dischargeEndDateChange() {
            var endDate = dischargeEndDate.value(),
                startDate = dischargeStartDate.value();

            if (endDate) {
                endDate = new Date(endDate);
                endDate.setDate(endDate.getDate());
                dischargeStartDate.max(endDate);
            } else if (startDate) {
                dischargeEndDate.min(new Date(startDate));
            } else {
                endDate = new Date();
                dischargeStartDate.max(endDate);
                dischargeEndDate.min(endDate);
            }
        }

        //  // AdmissiontartDate  and DischargeEndDate Validation Logic

        //var dateTypeAdmitstartDate = $(&quot;#DateTypeAdmitDate&quot;).kendoDatePicker({
        //    change: dateTypeAdmitstartDateChange
        //}).data(&quot;kendoDatePicker&quot;);

        //var dateTypeDischargeEndDate = $(&quot;#DateTypeDischargeDate&quot;).kendoDatePicker({
        //    change: dateTypeDischargeEndDateChange
        //}).data(&quot;kendoDatePicker&quot;);

        //dateTypeAdmitstartDate.max(dateTypeDischargeEndDate.value());
        //dateTypeDischargeEndDate.min(dateTypeAdmitstartDate.value());

        //function dateTypeAdmitstartDateChange() {
        //    var startDate = dateTypeAdmitstartDate.value(),
        //        endDate = dateTypeDischargeEndDate.value();

        //    if (startDate) {
        //        startDate = new Date(startDate);
        //        startDate.setDate(startDate.getDate());
        //        dateTypeDischargeEndDate.min(startDate);
        //    } else if (endDate) {
        //        dateTypeAdmitstartDate.max(new Date(endDate));
        //    } else {
        //        endDate = new Date();
        //        dateTypeAdmitstartDate.max(endDate);
        //        dateTypeDischargeEndDate.min(endDate);
        //    }
        //}

        //function dateTypeDischargeEndDateChange() {
        //    var endDate = dateTypeDischargeEndDate.value(),
        //        startDate = dateTypeAdmitstartDate.value();

        //    if (endDate) {
        //        endDate = new Date(endDate);
        //        endDate.setDate(endDate.getDate());
        //        dateTypeAdmitstartDate.max(endDate);
        //    } else if (startDate) {
        //        dateTypeDischargeEndDate.min(new Date(startDate));
        //    } else {
        //        endDate = new Date();
        //        dateTypeAdmitstartDate.max(endDate);
        //        dateTypeDischargeEndDate.min(endDate);
        //    }
        //}

       
    });
    

            
            
                

    
        PA History Report
    
    
        
            Start Date
            
                select
	jQuery(function(){jQuery(&quot;#PaymentStartDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
            End Date
            
                select
	jQuery(function(){jQuery(&quot;#PaymentEndDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;M/d/yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

            
        
        
            MRN
            
                
            
        
        
            
                Filter              
                
                    
                    
                        
                            
                            Please correct the following Errors
                        
                        
                        
                    
                
            
        
        
            
                ExportExport PA Billing HistoryIDDOEDOSPatient Last NamePatient First NameDOBMRNGUMRNInvoiceDetail NumberPlanPlan DescriptionBilling Provider IDBilling ProviderDepartmentDivisionFACPOSQuantityCPTDescriptionCharge ModifierDxCD1ChargeAdjCoinDedPMTBalanceAmountTransaction DatePay CodeCheck NumberBatch Numberseek-warrow-w1arrow-eseek-e15select152550100500items per pageNo items to display
	jQuery(function(){jQuery(&quot;#PatientAccountHistoryGrid&quot;).kendoGrid({&quot;dataBound&quot;:AddTitleToGrid,&quot;columns&quot;:[{&quot;title&quot;:&quot;ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ID&quot;,&quot;data-title&quot;:&quot;ID&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;DOE&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DOE&quot;,&quot;data-title&quot;:&quot;DOE&quot;},&quot;field&quot;:&quot;DOE&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;DOS&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DOS&quot;,&quot;data-title&quot;:&quot;DOS&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;DOS&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient Last Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientLastName&quot;,&quot;data-title&quot;:&quot;Patient Last Name&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;PatientLastName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Patient First Name&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PatientFirstName&quot;,&quot;data-title&quot;:&quot;Patient First Name&quot;},&quot;field&quot;:&quot;PatientFirstName&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;DOB&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DOB&quot;,&quot;data-title&quot;:&quot;DOB&quot;},&quot;field&quot;:&quot;DOB&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;MRN&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;MRN&quot;,&quot;data-title&quot;:&quot;MRN&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;MRN&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;GUMRN&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;GUMRN&quot;,&quot;data-title&quot;:&quot;GUMRN&quot;},&quot;field&quot;:&quot;GUMRN&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Invoice&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Invoice&quot;,&quot;data-title&quot;:&quot;Invoice&quot;},&quot;field&quot;:&quot;Invoice&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Detail Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DetailNumber&quot;,&quot;data-title&quot;:&quot;Detail Number&quot;},&quot;field&quot;:&quot;DetailNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Plan&quot;,&quot;data-title&quot;:&quot;Plan&quot;},&quot;field&quot;:&quot;Plan&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PlanDescription&quot;,&quot;data-title&quot;:&quot;Plan Description&quot;},&quot;field&quot;:&quot;PlanDescription&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Billing Provider ID&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillingProviderID&quot;,&quot;data-title&quot;:&quot;Billing Provider ID&quot;},&quot;field&quot;:&quot;BillingProviderID&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Billing Provider&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BillingProvider&quot;,&quot;data-title&quot;:&quot;Billing Provider&quot;},&quot;field&quot;:&quot;BillingProvider&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Department&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Department&quot;,&quot;data-title&quot;:&quot;Department&quot;},&quot;field&quot;:&quot;Department&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Division&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Division&quot;,&quot;data-title&quot;:&quot;Division&quot;},&quot;field&quot;:&quot;Division&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;FAC&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;FAC&quot;,&quot;data-title&quot;:&quot;FAC&quot;},&quot;field&quot;:&quot;FAC&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;POS&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;POS&quot;,&quot;data-title&quot;:&quot;POS&quot;},&quot;field&quot;:&quot;POS&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Quantity&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Quantity&quot;,&quot;data-title&quot;:&quot;Quantity&quot;},&quot;field&quot;:&quot;Quantity&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;CPT&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CPT&quot;,&quot;data-title&quot;:&quot;CPT&quot;},&quot;field&quot;:&quot;CPT&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Description&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Description&quot;,&quot;data-title&quot;:&quot;Description&quot;},&quot;field&quot;:&quot;Description&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charge Modifier&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargeModifier&quot;,&quot;data-title&quot;:&quot;Charge Modifier&quot;},&quot;field&quot;:&quot;ChargeModifier&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;DxCD1&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;DxCD1&quot;,&quot;data-title&quot;:&quot;DxCD1&quot;},&quot;field&quot;:&quot;DxCD1&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Charge&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargeAmount&quot;,&quot;data-title&quot;:&quot;Charge&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;ChargeAmount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Adj&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargeAdjustment&quot;,&quot;data-title&quot;:&quot;Adj&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;ChargeAdjustment&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Coin&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CoInsurance&quot;,&quot;data-title&quot;:&quot;Coin&quot;},&quot;field&quot;:&quot;CoInsurance&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Ded&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Deductible&quot;,&quot;data-title&quot;:&quot;Ded&quot;},&quot;field&quot;:&quot;Deductible&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;PMT&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargePayment&quot;,&quot;data-title&quot;:&quot;PMT&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;ChargePayment&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Balance&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;ChargeBalance&quot;,&quot;data-title&quot;:&quot;Balance&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;ChargeBalance&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Amount&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;Amount&quot;,&quot;data-title&quot;:&quot;Amount&quot;},&quot;field&quot;:&quot;Amount&quot;,&quot;format&quot;:&quot;{0:c}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Transaction Date&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;TransactionDate&quot;,&quot;data-title&quot;:&quot;Transaction Date&quot;},&quot;width&quot;:&quot;100px&quot;,&quot;field&quot;:&quot;TransactionDate&quot;,&quot;format&quot;:&quot;{0:d}&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Pay Code&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;PayCode&quot;,&quot;data-title&quot;:&quot;Pay Code&quot;},&quot;field&quot;:&quot;PayCode&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Check Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;CheckNumber&quot;,&quot;data-title&quot;:&quot;Check Number&quot;},&quot;field&quot;:&quot;CheckNumber&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Batch Number&quot;,&quot;headerAttributes&quot;:{&quot;data-field&quot;:&quot;BatchNumber&quot;,&quot;data-title&quot;:&quot;Batch Number&quot;},&quot;field&quot;:&quot;BatchNumber&quot;,&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;pageSizes&quot;:[15,25,50,100,500],&quot;buttonCount&quot;:10},&quot;sortable&quot;:true,&quot;filterable&quot;:true,&quot;resizable&quot;:true,&quot;scrollable&quot;:false,&quot;toolbar&quot;:{&quot;command&quot;:[{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;UpdatePAHistoryLink(2)\&quot; id=\&quot;ExportPAHistoryButton\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export&quot;},{&quot;name&quot;:null,&quot;attr&quot;:&quot; onclick=\&quot;UpdatePAHistoryLink(1)\&quot;&quot;,&quot;buttonType&quot;:&quot;ImageAndText&quot;,&quot;text&quot;:&quot;Export PA Billing History&quot;}]},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/DRISDEV/PatientAccounting/PatientAccountHistory_Read&quot;,&quot;data&quot;:GetMRN},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:15,&quot;page&quot;:1,&quot;total&quot;:0,&quot;serverPaging&quot;:true,&quot;serverSorting&quot;:true,&quot;serverFiltering&quot;:true,&quot;serverGrouping&quot;:true,&quot;serverAggregates&quot;:true,&quot;sort&quot;:[{&quot;field&quot;:&quot;Invoice&quot;,&quot;dir&quot;:&quot;asc&quot;},{&quot;field&quot;:&quot;TransactionDate&quot;,&quot;dir&quot;:&quot;asc&quot;},{&quot;field&quot;:&quot;DetailNumber&quot;,&quot;dir&quot;:&quot;asc&quot;}],&quot;filter&quot;:[],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ID&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;DOE&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;DOS&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PatientLastName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PatientFirstName&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DOB&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;MRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GUMRN&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Invoice&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DetailNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Plan&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PlanDescription&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingProviderID&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BillingProvider&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Department&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Division&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FAC&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;POS&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Quantity&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CPT&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Description&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ChargeModifier&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DxCD1&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ChargeAmount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ChargeAdjustment&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CoInsurance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Deductible&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ChargePayment&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ChargeBalance&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Amount&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TransactionDate&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;PayCode&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CheckNumber&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BatchNumber&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});

            
        
    

   
    $(document).ready(function () {
        // UpdateGridSource();
    });
    function ExporttoExcelPA()
    {
        $.ajax({
            url: '/DRISDEV/PatientAccounting/ExportPAHistory',
            type: &quot;GET&quot;,
            data: {
                startdate: $(&quot;#PaymentStartDate&quot;).val(),
                enddate: $(&quot;#PaymentEndDate&quot;).val(),
                mrn: $(&quot;#txtMRN&quot;).val(),
            }
        });
    }
    function GetMRN() {
        return {
            mrn: $(&quot;#txtMRN&quot;).val(),
            startdate: $(&quot;#PaymentStartDate&quot;).val(),
            enddate: $(&quot;#PaymentEndDate&quot;).val(),
        }
    }
    function UpdatePAHistorySource() {
        $('#divValidationSummaryHistoryFilter').hide();
        var value = $.trim($(&quot;#txtMRN&quot;).val());
        var startdate = $(&quot;#PaymentStartDate&quot;).val(),enddate = $(&quot;#PaymentEndDate&quot;).val();
        if (kendo.parseDate(startdate) &amp;&amp; kendo.parseDate(enddate)) {
            $('#PatientAccountHistoryGridDiv').show();
            $('#PatientAccountHistoryGrid').data('kendoGrid').dataSource.read();
            $('#divValidationSummary').hide();
        }
        else {
           // $('#divValidationSummary').show();
            $('#listValidationErrorsPHFilters').html(&quot;&lt;ul class='list-group list-group-flush'>&lt;li class='list-group-item'>Start Date or End Date&lt;/li>&lt;/ul>&quot;);
            $('#divValidationSummaryHistoryFilter').show();
            var grid = $(&quot;#PatientAccountHistoryGrid&quot;).data(&quot;kendoGrid&quot;);
            grid.dataSource.data([]);
        }
        //$('#OpenARGrid').data('kendoGrid').refresh();
     //   UpdatePAHistoryLink();
       // UpdatePABillingHistoryLink();
    }
    function UpdatePAHistoryLink(data) {
        var grid = $(&quot;#PatientAccountHistoryGrid&quot;).data(&quot;kendoGrid&quot;),
            parameterMap = grid.dataSource.transport.parameterMap,
             mrn = $(&quot;#txtMRN&quot;).val(),
             startdate = $(&quot;#PaymentStartDate&quot;).val(),           
            enddate = $(&quot;#PaymentEndDate&quot;).val();
        if (data == 1) {
            var url = '/DRISDEV/PatientAccounting/ExportPABillingHistory';
        } else {
             var url = '/DRISDEV/PatientAccounting/ExportPAHistory';
        }
        var data = parameterMap({ sort: grid.dataSource.sort(), filter: grid.dataSource.filter(), group: grid.dataSource.group() });
        var getparam = &quot;sort=&quot;
        if (data.sort !== &quot;&quot;) {
            getparam += data.sort;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;filter=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.filter;
        } else {
            getparam += &quot;~&quot;;
        }
        getparam += &quot;&amp;group=&quot;
        if (data.filter !== &quot;&quot;) {
            getparam += data.group;
        } else {
            getparam += &quot;~&quot;;
        }
        window.location = url + &quot;?request=&quot; + getparam + &quot;&amp;startdate=&quot; + startdate + &quot;&amp;enddate=&quot; + enddate + &quot;&amp;mrn=&quot; + mrn;
    }
    



            


        
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;page&quot;)/div[@class=&quot;row&quot;]/div[@class=&quot;col pl-0&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='page']/div[2]/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Patient History Billing Report'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Physician Billing Detail Report'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
