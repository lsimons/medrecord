<%@page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Test ZorgGemak Service</title>

  <script type="text/javascript" charset="utf-8" src="<c:url value='/resources/scripts/jquery.js'/>"></script>
  <script type="text/javascript" charset="utf-8" src="<c:url value='/resources/scripts/zorggemak.js'/>"></script>
  <script type="text/javascript" charset="utf-8">
    $(document).ready(function() {
      initZorgGemak();
    });
    /* ready */

    function addInputLine() {
      var entry = $('#input_template').clone();
      entry.appendTo('#input_list');
      entry.find("#path").val("");
      entry.find("#thevalue").val("");
    }
    /* addInputLine */

    function addRelationship() {
      var path = new Array();
      var value = new Array();

      $("#result").html("Loading data...");

      $.map($("li"), function(item, index) {
        path[index] = $(item).find("#path").val();
        value[index] = $(item).find("#thevalue").val();
      });

      setUserId(localStorage.userid);
      setSystemId(localStorage.systemid);
      addPartyRelationship($("#sourceid").val(), $("#targetid").val(), path, value, setResult);
    }
    /* addRelationship */

    function setResult(data) {
      if (data.errorcode != 0) {
        getLastError(data.reqid, setError);
      }
      else {
        var res = data.result.replace(/</g, "&lt;").replace(/>/g, "&gt;");
        $("#result").html("Result of call:<pre>" + res + "</pre>");
      }
    }
    /* setResult */

    function setError(data) {
      $("#result").html("Error: " + data.errorstr + " (" + data.errorcode + ") <br />RequestId: " + data.reqid +
          "<br />" + data.errormsg + "<br />" + data.timepassed + " msec ago" +
          "<br /><pre>" + data.errordetail + "</pre>");
    }
    /* setError */
  </script>
</head>

<body>
<h2>Call web API function 'addPartyRelationship'</h2>
Is passing the call to the openEHR kernel SOAP DemographicService.addPartyRelationship<br/> <a
    href="https://sites.google.com/a/zorggemak.com/archetypegui/middleware/demographic-functions/addpartyrelationshiptoparty">Description</a><br/>
<br/>

<div>
  &nbsp; Source Node Id <input type="text" name="sourceid" id="sourceid" value="" size="50"/> &nbsp; Target Node Id
  <input type="text" name="targetid" id="targetid" value="" size="50"/> <br/>
  <ol id="input_list">
    <li id="input_template">
      <span id="inlist">&nbsp; Path <input type="text" name="path" id="path" value="" size="100"/> &nbsp; Value <input
          type="text" name="thevalue" id="thevalue" value="" size="50"/></span>
    </li>
  </ol>
  <input type="submit" value="Add Path/Value" name="AddInputLine" onclick="addInputLine();"/>

  <p/>
  <input type="submit" value="Get Result" name="GetResult" onclick="addRelationship();"/>
</div>
<br/>

<div id="result"></div>
<p/>
<a href="home">Back to Homepage</a> <br/>
</body>
</html>