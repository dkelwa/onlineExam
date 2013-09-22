<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"  "http://www.w3.org/TR/html4/strict.dtd" >
<html>
<head>
  <title>Untitled Document</title>
  	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>

  <script src="http://code.jquery.com/jquery-1.4.2.min.js"></script>
  <link rel="stylesheet" type="text/css" href="ie6.css" />
  <link  href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
   <script	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
   <script	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
 </head>
  
 <script type="text/javascript">
      $(document).ready(function()
       {
        $("button").button();
      //$('input:text, input:password').button()   
	    $(".datepicker" ).datepicker();
        $(":submit").button()
      });
  </script>
     
<style type="text/css">
 td{font-size:12px; font-family:sans-serif,tahoma,verdana,sans-serif; }  
  
  .bkgColor{ 
    background: #F6F6F6;
	border-color: #4E8CCF; 
	width:83%; 
	float:left;
	height:500px;
	
	}
  
  div.ui-datepicker{
  font-size:10px;
 }
 
  .tree_View
  {
	border-right: 1px solid #4E8CCF; 
	float: left;
	width:16%;
	height: 500px;"  
  }

 .panel-header
   {
	   width: 82%; 
	   height:12px; 
	   float: left;
   }
 .panel-title
    {
	  
	}
	
 .top_botton
	{
	margin-top:5px; 
	margin-left:10px;
	margin-bottom:5px;
	}
	
 .bottom_border
 {
	border-bottom:3px solid #4E8CCF;
	width:83%;
	float:left;
 }
 .bottom_button
  {
	margin-top:5px; 
	margin-left:10px;
	margin-bottom:5px;	
  }
  
   input
  {
	 width:113px;
  }
   
input:focus
 {
  outline:none;
}
</style>
</head>
<body>
<form method="post" action="save_company" modelAttribute="companyForm">

  <div class="panel-header">
		<div class="panel-title">Company Detatil's</div>		
		</div>
  
 

  <div class="bkgColor">
  <div id="dlg-buttons" class="top_botton" align="left">  
         <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onClick="savereg()">Save</a>  
         <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onClick="javascript:$('#dlg').dialog('close')">Cancel</a>
   </div>    
 
  <table  height="426px" width="770" border="0" align="center" style="margin-left:20px;">
    <tr>
      <td width="109">Company<span style="color: #FF0000">*</span></td>
      <td colspan="3"><input type="text" name="companyDto.companyName" style="width:363px;" id="company" size="58"/></td>
      <td width="101" align="left">Company Code<span style="color: #FF0000">*</span></td>
      <td width="141"><input type="text" name="companyDto.companyCode" id="company_Code" size="16" /></td>
    </tr>
    <tr>
     <td>Fin. Year From<span style="color: #FF0000">*</span></td>
     <td width="162"><input type="text" class="datepicker" name="companyDto.financialYrBeg"  size="16" id="finYearFrom" /></td>
      <td width="80">Year To<span style="color: #FF0000">*</span></td>
      <td width="151"><input type="text"  class="datepicker" name="companyDto.financialYrEnd" size="16" id="yearTo"/></td>
      <td align="left">Data Lock</td>
      <td><input type="text" name="companyDto.systemLocking" size="16" class="datepicker"  id="dataLock" /></td>
    </tr>
    <tr>
      <td>Address </td>
      <td colspan="3"><input type="text" style="width:363px;" name="companyDto.companyAdd" id="address" size="58" /></td>
      <td align="left">Phone1 (0)</td>
      <td><input type="text" id="phone0" name="companyDto.phone1" size="16" /></td>
    </tr>
    <tr>
      <td>Phone 2 (0)</td>
      <td><input type="text" name="companyDto.phone2" size="16" id="phone2" /></td>
      <td>Factory Phone</td>
      <td><input type="text" name="companyDto.phoneFactory" size="16" id="factoryPhone" /></td>
      <td align="left">PIN/ZIP Code</td>
      <td><input type="text" name="companyDto.pinZipCode" size="16" id="pinZipCode" /></td>
    </tr>
    <tr>
      <td>Reg. Ofc. Addr.</td>
      <td colspan="3"><input type="text" style="width:363px;" name="companyDto.officeAdd" id="regOfcAddr" size="58" /></td>
      <td align="left">Reg. Off. Number</td>
      <td><input type="text" name="companyDto.phoneOffice" id="regOffNumber" size="16" /></td>
    </tr>
    <tr>
      <td>City</td>
      <td><input type="text" name="companyDto.companyCity" size="16" id="city" /></td>
      <td>State</td>
      <td><input type="text" name="companyDto.companyState" id="state" size="16" /></td>
      <td align="left">Country</td>
      <td><input type="text" id="country" name="companyDto.companyCountry" size="16" /></td>
    </tr>
   
   
    <tr>
      <td>TIN (VAT) No.</td>
      <td><input type="text" name="companyDto.vatNo" id="tinVatNo" size="16"/></td>
      <td>LST Date</td>
      <td><input type="text" class="datepicker" name="companyDto.vatDt" size="16" id="lstDate"/></td>
      <td align="left">Fax</td>
      <td><input type="text" name="companyDto.fax" id="fax" size="16"/></td>
    </tr>
    <tr>
      <td>TIN (CST) No.</td>
      <td><input type="text" name="companyDto.cstNo" id="tinCstNo" size="16" /></td>
      <td>CST Date</td>
      <td><input type="text" name="companyDto.cstDt" class="datepicker" size="16"  id="cstDate"/></td>
      <td align="left">Curr. Symbol</td>
      <td><input type="text" id="currencySymbol" name="companyDto.currancySymbol" size="16" /></td>
    </tr>
    <tr>
      <td>PAN</td>
      <td><input type="text" name="companyDto.panNo" id="pan" size="16" /></td>
      <td>PAN Date</td>
      <td><input type="text" name="companyDto.panDt" id="panDate" class="datepicker" size="16"/></td>
      <td align="left">IE Code</td>
      <td><input type="text" name="companyDto.importExportCode" id="ieCode" size="16" /></td>
    </tr>
    <tr>
      <td>Service Tax No</td>
      <td><input type="text" name="companyDto.servTaxNo" id="serviceTaxNo" size="16" /></td>
      <td>Ser. Date</td>
      <td><input type="text" name="companyDto.servTaxDt" class="datepicker" size="16" id="serDate" /></td>
      <td align="left">Drug Licence 1</td>
      <td><input type="text" name="companyDto.drugLicence1" id="drugLicence1" size="16" /></td>
    </tr>
    <tr>
      <td>Email ID</td>
      <td><input id="emailId" type="text" size="16"  name="companyDto.emailId"></td>
      <td>Website</td>
      <td><input id="website" type="text" size="16"  name="companyDto.website"></td>
      <td align="left">Drug Licence 2</td>
      <td><input type="text" name="companyDto.drugLicence2" id="drugLicence2" size="16" /></td>
    </tr>
    <tr>
      <td>Excise Reg Ecc No.</td>
      <td><input type="text" name="companyDto.exciseECCNo" id="exciseRegEccNo" size="16" /></td>
      <td>Range</td>
      <td><input type="text" name="companyDto.rangeAdd"  id="range" size="16" /></td>
      <td align="left">Division</td>
      <td><input type="text" name="companyDto.division" id="division" size="16"/></td>
    </tr>
    <tr>
      <td>MSME Code</td>
      <td><input type="text" name="companyDto.msmeCode" id="memeCode" size="16" /></td>
      <td>Gen. Remark</td>
      <td colspan="3"><input type="text" name="companyDto.generalRemark" id="genRemark" style="width:373px;" size="64" /></td>
    </tr>
  </table>
  <div id="dlg-buttons" class="bottom_button" align="left">  
  		<input type="submit" value="Submit">
         <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onClick="javascript:$('#dlg').dialog('close')">Cancel</a>
        </div>    
  </div>
   <div class="bottom_border"></div>
   
 </form>
</body>
</html>