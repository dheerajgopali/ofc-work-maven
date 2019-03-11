package org.dheeraj.learning.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class PerfStatsDTO {
        private String testname;
        private String trialtype;
        private String runlevel;
        private Timestamp builddate;
        private String buildlabel;
        private String prpcversion;
        private Timestamp teststart;
        private Timestamp testend;
        private BigDecimal activitycount;
        private BigDecimal alertcount;
        private String application;
        private BigDecimal commitcount;
        private BigDecimal commitrowcount;
        private BigDecimal connectcount;
        private BigDecimal connectelapsed;
        private BigDecimal dbopexceedingthresholdcount;
        private BigDecimal declarativerulereadcount;
        private BigDecimal declarativeruleslookupcount;
        private BigDecimal flowcount;
        private BigDecimal infergeneratedjavacount;
        private BigDecimal infergeneratedjavaelapsed;
        private BigDecimal infergeneratedjavahlelapsed;
        private BigDecimal javaassemblecount;
        private BigDecimal javacompilecount;
        private BigDecimal javageneratecount;
        private BigDecimal javasyntaxcpu;
        private BigDecimal otheriocount;
        private BigDecimal otheriocpu;
        private BigDecimal otherioelapsed;
        private BigDecimal parserulecount;
        private BigDecimal processcpu;
        private BigDecimal rdbiocount;
        private BigDecimal rdbioelapsed;
        private BigDecimal rulecount;
        private BigDecimal rulefromcachecount;
        private BigDecimal ruleioelapsed;
        private BigDecimal rulesexecuted;
        private BigDecimal ruleused;
        private BigDecimal runotherrulecount;
        private BigDecimal runwhencount;
        private String systemname;
        private String systemnode;
        private String systemnodeid;
        private Timestamp systemstart;
        private BigDecimal totalreqcpu;
        private BigDecimal totalreqtime;
        private String pxobjclass;
        private String pzinskey;
        private String pxinsname;
        private BigDecimal javaassemblehlelapsed;
        private String buildinfo;
        private String prpcrelease;
        private BigDecimal buildnumber;
        private BigDecimal wallseconds;
        private BigDecimal testelapsedminutes;
        private BigDecimal errorcount;
        private Integer linecountdata;
        private Integer infocount;
        private String dbinputbytes;
        private String outputbytes;
        private String inputbytes;
        private String dboutputbytes;
        private String isga;
        private String isvalidrun;
        private String ispristinerun;
        private String teamemail;
        private String pristinebuildnumber;
        private String validationjobId;
        private BigDecimal gctotalevents;
        private BigDecimal gctotalmajor;
        private BigDecimal gctotalminor;
        private BigDecimal gctotalother;
        private BigDecimal gctotalduration;
        private BigDecimal gctotalgarbage;
        private BigDecimal gctotalprecollection;
        private BigDecimal gcmaxduration;
        private BigDecimal gcmaxgarbage;
        private BigDecimal gctotalpostcollection;
        private BigDecimal gcmaxpostcollection;
        private BigDecimal gcmaxprecollection;
        private String teamname;
        private BigDecimal loadedclasscount;
        private BigDecimal activationdatatimeelapsed;
        private BigDecimal commitelapsed;
        private BigDecimal declarativerulesinvokedcount;
        private BigDecimal declarativerulesinvokedcpu;
        private BigDecimal declarativeruleslookupcpu;
        private BigDecimal declexprctxfreeusecount;
        private BigDecimal declntwksbuildconstcpu;
        private BigDecimal declntwksbuildconstelapsed;
        private BigDecimal declntwksbuildhlcpu;
        private BigDecimal declntwksbuildhlelap;
        private BigDecimal declrulesinvokedelapsed;
        private BigDecimal declruleslookupelapsed;
        private BigDecimal indexcount;
        private BigDecimal infergeneratedjavacountcpu;
        private BigDecimal interactions;
        private BigDecimal javaassemblecpu;
        private BigDecimal javaassembleelapsed;
        private BigDecimal javacompilecpu;
        private BigDecimal javacompileelapsed;
        private BigDecimal javageneratecpu;
        private BigDecimal javagenerateelapsed;
        private BigDecimal legacyruleapiusedcount;
        private BigDecimal listrowwithunfilteredstrmcnt;
        private BigDecimal listwithunfilteredstrmcnt;
        private BigDecimal lookuplistdbfetches;
        private BigDecimal otherbrowsecpu;
        private BigDecimal otherbrowseelapsed;
        private BigDecimal othercount;
        private BigDecimal otherfromcachecount;
        private BigDecimal proceduralrulereadcount;
        private BigDecimal rdbrowwithoutstreamcount;
        private BigDecimal rdbwithoutstreamcount;
        private BigDecimal rulebrowsecpu;
        private BigDecimal rulebrowseelapsed;
        private BigDecimal rulecpu;
        private BigDecimal runmodelcount;
        private BigDecimal runstreamcount;
        private BigDecimal peakthreadcount;
        private BigDecimal threadcount;
        private BigDecimal totalloadedclasscount;
        private BigDecimal unloadedclasscount;
        private BigDecimal totalstartedthreadcount;
        private BigDecimal infergeneratedjavacpu;
        private String testmode;
        private String commitid;
        private String mprid;
        private String testrunstatus;

        public String getString(String paramName){
            switch(paramName){
                case "testname":
                    return testname;
                default:
                    System.out.println("Parameter not found");
                    break;
            }
            return null;
        }

        public Double getDouble(String paramName){
                switch(paramName){
                        case "activitycount":
                                return activitycount.doubleValue();
                        case "alertcount":
                                return alertcount.doubleValue();
                        case "commitcount":
                                return commitcount.doubleValue();
                        case "commitrowcount":
                                return commitrowcount.doubleValue();
                        case "connectcount":
                                return connectcount.doubleValue();
                        case "connectelapsed":
                                return connectelapsed.doubleValue();
                        case "dbopexceedingthresholdcount":
                                return dbopexceedingthresholdcount.doubleValue();
                        case "declarativerulereadcount":
                                return declarativerulereadcount.doubleValue();
                        case "declarativeruleslookupcount":
                                return declarativeruleslookupcount.doubleValue();
                        case "flowcount":
                                return flowcount.doubleValue();
                        case "infergeneratedjavacount":
                                return infergeneratedjavacount.doubleValue();
                        case "infergeneratedjavaelapsed":
                                return infergeneratedjavaelapsed.doubleValue();
                        case "infergeneratedjavahlelapsed":
                                return infergeneratedjavahlelapsed.doubleValue();
                        case "javaassemblecount":
                                return javaassemblecount.doubleValue();
                        case "javacompilecount":
                                return javacompilecount.doubleValue();
                        case "javageneratecount":
                                return javageneratecount.doubleValue();
                        case "javasyntaxcpu":
                                return javasyntaxcpu.doubleValue();
                        case "otheriocount":
                                return otheriocount.doubleValue();
                        case "otheriocpu":
                                return otheriocpu.doubleValue();
                        case "otherioelapsed":
                                return otherioelapsed.doubleValue();
                        case "parserulecount":
                                return parserulecount.doubleValue();
                        case "processcpu":
                                return processcpu.doubleValue();
                        case "rdbiocount":
                                return rdbiocount.doubleValue();
                        case "rdbioelapsed":
                                return rdbioelapsed.doubleValue();
                        case "rulecount":
                                return rulecount.doubleValue();
                        case "rulefromcachecount":
                                return rulefromcachecount.doubleValue();
                        case "ruleioelapsed":
                                return ruleioelapsed.doubleValue();
                        case "rulesexecuted":
                                return rulesexecuted.doubleValue();
                        case "ruleused":
                                return ruleused.doubleValue();
                        case "runotherrulecount":
                                return runotherrulecount.doubleValue();
                        case "runwhencount":
                                return runwhencount.doubleValue();
                        case "totalreqcpu":
                                return totalreqcpu.doubleValue();
                        case "totalreqtime":
                                return totalreqtime.doubleValue();
                        case "javaassemblehlelapsed":
                                return javaassemblehlelapsed.doubleValue();
                        case "buildnumber":
                                return buildnumber.doubleValue();
                        case "wallseconds":
                                return wallseconds.doubleValue();
                        case "testelapsedminutes":
                                return testelapsedminutes.doubleValue();
                        case "errorcount":
                                return errorcount.doubleValue();
                        case "gctotalevents":
                                return gctotalevents.doubleValue();
                        case "gctotalmajor":
                                return gctotalmajor.doubleValue();
                        case "gctotalminor":
                                return gctotalminor.doubleValue();
                        case "gctotalother":
                                return gctotalother.doubleValue();
                        case "gctotalduration":
                                return gctotalduration.doubleValue();
                        case "gctotalgarbage":
                                return gctotalgarbage.doubleValue();
                        case "gctotalprecollection":
                                return gctotalprecollection.doubleValue();
                        case "gcmaxduration":
                                return gcmaxduration.doubleValue();
                        case "gcmaxgarbage":
                                return gcmaxgarbage.doubleValue();
                        case "gctotalpostcollection":
                                return gctotalpostcollection.doubleValue();
                        case "gcmaxpostcollection":
                                return gcmaxpostcollection.doubleValue();
                        case "gcmaxprecollection":
                                return gcmaxprecollection.doubleValue();
                        case "loadedclasscount":
                                return loadedclasscount.doubleValue();
                        case "activationdatatimeelapsed":
                                return activationdatatimeelapsed.doubleValue();
                        case "commitelapsed":
                                return commitelapsed.doubleValue();
                        case "declarativerulesinvokedcount":
                                return declarativerulesinvokedcount.doubleValue();
                        case "declarativerulesinvokedcpu":
                                return declarativerulesinvokedcpu.doubleValue();
                        case "declarativeruleslookupcpu":
                                return declarativeruleslookupcpu.doubleValue();
                        case "declexprctxfreeusecount":
                                return declexprctxfreeusecount.doubleValue();
                        case "declntwksbuildconstcpu":
                                return declntwksbuildconstcpu.doubleValue();
                        case "declntwksbuildconstelapsed":
                                return declntwksbuildconstelapsed.doubleValue();
                        case "declntwksbuildhlcpu":
                                return declntwksbuildhlcpu.doubleValue();
                        case "declntwksbuildhlelap":
                                return declntwksbuildhlelap.doubleValue();
                        case "declrulesinvokedelapsed":
                                return declrulesinvokedelapsed.doubleValue();
                        case "declruleslookupelapsed":
                                return declruleslookupelapsed.doubleValue();
                        case "indexcount":
                                return indexcount.doubleValue();
                        case "infergeneratedjavacountcpu":
                                return infergeneratedjavacountcpu.doubleValue();
                        case "interactions":
                                return interactions.doubleValue();
                        case "javaassemblecpu":
                                return javaassemblecpu.doubleValue();
                        case "javaassembleelapsed":
                                return javaassembleelapsed.doubleValue();
                        case "javacompilecpu":
                                return javacompilecpu.doubleValue();
                        case "javacompileelapsed":
                                return javacompileelapsed.doubleValue();
                        case "javageneratecpu":
                                return javageneratecpu.doubleValue();
                        case "javagenerateelapsed":
                                return javagenerateelapsed.doubleValue();
                        case "legacyruleapiusedcount":
                                return legacyruleapiusedcount.doubleValue();
                        case "listrowwithunfilteredstrmcnt":
                                return listrowwithunfilteredstrmcnt.doubleValue();
                        case "listwithunfilteredstrmcnt":
                                return listwithunfilteredstrmcnt.doubleValue();
                        case "lookuplistdbfetches":
                                return lookuplistdbfetches.doubleValue();
                        case "otherbrowsecpu":
                                return otherbrowsecpu.doubleValue();
                        case "otherbrowseelapsed":
                                return otherbrowseelapsed.doubleValue();
                        case "othercount":
                                return othercount.doubleValue();
                        case "otherfromcachecount":
                                return otherfromcachecount.doubleValue();
                        case "proceduralrulereadcount":
                                return proceduralrulereadcount.doubleValue();
                        case "rdbrowwithoutstreamcount":
                                return rdbrowwithoutstreamcount.doubleValue();
                        case "rdbwithoutstreamcount":
                                return rdbwithoutstreamcount.doubleValue();
                        case "rulebrowsecpu":
                                return rulebrowsecpu.doubleValue();
                        case "rulebrowseelapsed":
                                return rulebrowseelapsed.doubleValue();
                        case "rulecpu":
                                return rulecpu.doubleValue();
                        case "runmodelcount":
                                return runmodelcount.doubleValue();
                        case "runstreamcount":
                                return runstreamcount.doubleValue();
                        case "peakthreadcount":
                                return peakthreadcount.doubleValue();
                        case "threadcount":
                                return threadcount.doubleValue();
                        case "totalloadedclasscount":
                                return totalloadedclasscount.doubleValue();
                        case "unloadedclasscount":
                                return unloadedclasscount.doubleValue();
                        case "totalstartedthreadcount":
                                return totalstartedthreadcount.doubleValue();
                        case "infergeneratedjavacpu":
                                return infergeneratedjavacpu.doubleValue();
                        default:
                                System.out.println("Parameter not found");
                                break;
                }
                return null;
        }

        public Timestamp getTimeStamp(String paramName){
                switch(paramName){
                        case "builddate":
                                return builddate;
                        default:
                                System.out.println("Parameter not found");
                                break;
                }
                return null;
        }

        public String getTestname() {
                return testname;
        }

        public void setTestname(String testname) {
                this.testname = testname;
        }

        public String getTrialtype() {
                return trialtype;
        }

        public void setTrialtype(String trialtype) {
                this.trialtype = trialtype;
        }

        public String getRunlevel() {
                return runlevel;
        }

        public void setRunlevel(String runlevel) {
                this.runlevel = runlevel;
        }

        public Timestamp getBuilddate() {
                return builddate;
        }

        public void setBuilddate(Timestamp builddate) {
                this.builddate = builddate;
        }

        public String getBuildlabel() {
                return buildlabel;
        }

        public void setBuildlabel(String buildlabel) {
                this.buildlabel = buildlabel;
        }

        public String getPrpcversion() {
                return prpcversion;
        }

        public void setPrpcversion(String prpcversion) {
                this.prpcversion = prpcversion;
        }

        public Timestamp getTeststart() {
                return teststart;
        }

        public void setTeststart(Timestamp teststart) {
                this.teststart = teststart;
        }

        public Timestamp getTestend() {
                return testend;
        }

        public void setTestend(Timestamp testend) {
                this.testend = testend;
        }

        public BigDecimal getActivitycount() {
                return activitycount;
        }

        public void setActivitycount(BigDecimal activitycount) {
                this.activitycount = activitycount;
        }

        public BigDecimal getAlertcount() {
                return alertcount;
        }

        public void setAlertcount(BigDecimal alertcount) {
                this.alertcount = alertcount;
        }

        public String getApplication() {
                return application;
        }

        public void setApplication(String application) {
                this.application = application;
        }

        public BigDecimal getCommitcount() {
                return commitcount;
        }

        public void setCommitcount(BigDecimal commitcount) {
                this.commitcount = commitcount;
        }

        public BigDecimal getCommitrowcount() {
                return commitrowcount;
        }

        public void setCommitrowcount(BigDecimal commitrowcount) {
                this.commitrowcount = commitrowcount;
        }

        public BigDecimal getConnectcount() {
                return connectcount;
        }

        public void setConnectcount(BigDecimal connectcount) {
                this.connectcount = connectcount;
        }

        public BigDecimal getConnectelapsed() {
                return connectelapsed;
        }

        public void setConnectelapsed(BigDecimal connectelapsed) {
                this.connectelapsed = connectelapsed;
        }

        public BigDecimal getDbopexceedingthresholdcount() {
                return dbopexceedingthresholdcount;
        }

        public void setDbopexceedingthresholdcount(BigDecimal dbopexceedingthresholdcount) {
                this.dbopexceedingthresholdcount = dbopexceedingthresholdcount;
        }

        public BigDecimal getDeclarativerulereadcount() {
                return declarativerulereadcount;
        }

        public void setDeclarativerulereadcount(BigDecimal declarativerulereadcount) {
                this.declarativerulereadcount = declarativerulereadcount;
        }

        public BigDecimal getDeclarativeruleslookupcount() {
                return declarativeruleslookupcount;
        }

        public void setDeclarativeruleslookupcount(BigDecimal declarativeruleslookupcount) {
                this.declarativeruleslookupcount = declarativeruleslookupcount;
        }

        public BigDecimal getFlowcount() {
                return flowcount;
        }

        public void setFlowcount(BigDecimal flowcount) {
                this.flowcount = flowcount;
        }

        public BigDecimal getInfergeneratedjavacount() {
                return infergeneratedjavacount;
        }

        public void setInfergeneratedjavacount(BigDecimal infergeneratedjavacount) {
                this.infergeneratedjavacount = infergeneratedjavacount;
        }

        public BigDecimal getInfergeneratedjavaelapsed() {
                return infergeneratedjavaelapsed;
        }

        public void setInfergeneratedjavaelapsed(BigDecimal infergeneratedjavaelapsed) {
                this.infergeneratedjavaelapsed = infergeneratedjavaelapsed;
        }

        public BigDecimal getInfergeneratedjavahlelapsed() {
                return infergeneratedjavahlelapsed;
        }

        public void setInfergeneratedjavahlelapsed(BigDecimal infergeneratedjavahlelapsed) {
                this.infergeneratedjavahlelapsed = infergeneratedjavahlelapsed;
        }

        public BigDecimal getJavaassemblecount() {
                return javaassemblecount;
        }

        public void setJavaassemblecount(BigDecimal javaassemblecount) {
                this.javaassemblecount = javaassemblecount;
        }

        public BigDecimal getJavacompilecount() {
                return javacompilecount;
        }

        public void setJavacompilecount(BigDecimal javacompilecount) {
                this.javacompilecount = javacompilecount;
        }

        public BigDecimal getJavageneratecount() {
                return javageneratecount;
        }

        public void setJavageneratecount(BigDecimal javageneratecount) {
                this.javageneratecount = javageneratecount;
        }

        public BigDecimal getJavasyntaxcpu() {
                return javasyntaxcpu;
        }

        public void setJavasyntaxcpu(BigDecimal javasyntaxcpu) {
                this.javasyntaxcpu = javasyntaxcpu;
        }

        public BigDecimal getOtheriocount() {
                return otheriocount;
        }

        public void setOtheriocount(BigDecimal otheriocount) {
                this.otheriocount = otheriocount;
        }

        public BigDecimal getOtheriocpu() {
                return otheriocpu;
        }

        public void setOtheriocpu(BigDecimal otheriocpu) {
                this.otheriocpu = otheriocpu;
        }

        public BigDecimal getOtherioelapsed() {
                return otherioelapsed;
        }

        public void setOtherioelapsed(BigDecimal otherioelapsed) {
                this.otherioelapsed = otherioelapsed;
        }

        public BigDecimal getParserulecount() {
                return parserulecount;
        }

        public void setParserulecount(BigDecimal parserulecount) {
                this.parserulecount = parserulecount;
        }

        public BigDecimal getProcesscpu() {
                return processcpu;
        }

        public void setProcesscpu(BigDecimal processcpu) {
                this.processcpu = processcpu;
        }

        public BigDecimal getRdbiocount() {
                return rdbiocount;
        }

        public void setRdbiocount(BigDecimal rdbiocount) {
                this.rdbiocount = rdbiocount;
        }

        public BigDecimal getRdbioelapsed() {
                return rdbioelapsed;
        }

        public void setRdbioelapsed(BigDecimal rdbioelapsed) {
                this.rdbioelapsed = rdbioelapsed;
        }

        public BigDecimal getRulecount() {
                return rulecount;
        }

        public void setRulecount(BigDecimal rulecount) {
                this.rulecount = rulecount;
        }

        public BigDecimal getRulefromcachecount() {
                return rulefromcachecount;
        }

        public void setRulefromcachecount(BigDecimal rulefromcachecount) {
                this.rulefromcachecount = rulefromcachecount;
        }

        public BigDecimal getRuleioelapsed() {
                return ruleioelapsed;
        }

        public void setRuleioelapsed(BigDecimal ruleioelapsed) {
                this.ruleioelapsed = ruleioelapsed;
        }

        public BigDecimal getRulesexecuted() {
                return rulesexecuted;
        }

        public void setRulesexecuted(BigDecimal rulesexecuted) {
                this.rulesexecuted = rulesexecuted;
        }

        public BigDecimal getRuleused() {
                return ruleused;
        }

        public void setRuleused(BigDecimal ruleused) {
                this.ruleused = ruleused;
        }

        public BigDecimal getRunotherrulecount() {
                return runotherrulecount;
        }

        public void setRunotherrulecount(BigDecimal runotherrulecount) {
                this.runotherrulecount = runotherrulecount;
        }

        public BigDecimal getRunwhencount() {
                return runwhencount;
        }

        public void setRunwhencount(BigDecimal runwhencount) {
                this.runwhencount = runwhencount;
        }

        public String getSystemname() {
                return systemname;
        }

        public void setSystemname(String systemname) {
                this.systemname = systemname;
        }

        public String getSystemnode() {
                return systemnode;
        }

        public void setSystemnode(String systemnode) {
                this.systemnode = systemnode;
        }

        public String getSystemnodeid() {
                return systemnodeid;
        }

        public void setSystemnodeid(String systemnodeid) {
                this.systemnodeid = systemnodeid;
        }

        public Timestamp getSystemstart() {
                return systemstart;
        }

        public void setSystemstart(Timestamp systemstart) {
                this.systemstart = systemstart;
        }

        public BigDecimal getTotalreqcpu() {
                return totalreqcpu;
        }

        public void setTotalreqcpu(BigDecimal totalreqcpu) {
                this.totalreqcpu = totalreqcpu;
        }

        public BigDecimal getTotalreqtime() {
                return totalreqtime;
        }

        public void setTotalreqtime(BigDecimal totalreqtime) {
                this.totalreqtime = totalreqtime;
        }

        public String getPxobjclass() {
                return pxobjclass;
        }

        public void setPxobjclass(String pxobjclass) {
                this.pxobjclass = pxobjclass;
        }

        public String getPzinskey() {
                return pzinskey;
        }

        public void setPzinskey(String pzinskey) {
                this.pzinskey = pzinskey;
        }

        public String getPxinsname() {
                return pxinsname;
        }

        public void setPxinsname(String pxinsname) {
                this.pxinsname = pxinsname;
        }

        public BigDecimal getJavaassemblehlelapsed() {
                return javaassemblehlelapsed;
        }

        public void setJavaassemblehlelapsed(BigDecimal javaassemblehlelapsed) {
                this.javaassemblehlelapsed = javaassemblehlelapsed;
        }

        public String getBuildinfo() {
                return buildinfo;
        }

        public void setBuildinfo(String buildinfo) {
                this.buildinfo = buildinfo;
        }

        public String getPrpcrelease() {
                return prpcrelease;
        }

        public void setPrpcrelease(String prpcrelease) {
                this.prpcrelease = prpcrelease;
        }

        public BigDecimal getBuildnumber() {
                return buildnumber;
        }

        public void setBuildnumber(BigDecimal buildnumber) {
                this.buildnumber = buildnumber;
        }

        public BigDecimal getWallseconds() {
                return wallseconds;
        }

        public void setWallseconds(BigDecimal wallseconds) {
                this.wallseconds = wallseconds;
        }

        public BigDecimal getTestelapsedminutes() {
                return testelapsedminutes;
        }

        public void setTestelapsedminutes(BigDecimal testelapsedminutes) {
                this.testelapsedminutes = testelapsedminutes;
        }

        public BigDecimal getErrorcount() {
                return errorcount;
        }

        public void setErrorcount(BigDecimal errorcount) {
                this.errorcount = errorcount;
        }

        public Integer getLinecountdata() {
                return linecountdata;
        }

        public void setLinecountdata(Integer linecountdata) {
                this.linecountdata = linecountdata;
        }

        public Integer getInfocount() {
                return infocount;
        }

        public void setInfocount(Integer infocount) {
                this.infocount = infocount;
        }

        public String getDbinputbytes() {
                return dbinputbytes;
        }

        public void setDbinputbytes(String dbinputbytes) {
                this.dbinputbytes = dbinputbytes;
        }

        public String getOutputbytes() {
                return outputbytes;
        }

        public void setOutputbytes(String outputbytes) {
                this.outputbytes = outputbytes;
        }

        public String getInputbytes() {
                return inputbytes;
        }

        public void setInputbytes(String inputbytes) {
                this.inputbytes = inputbytes;
        }

        public String getDboutputbytes() {
                return dboutputbytes;
        }

        public void setDboutputbytes(String dboutputbytes) {
                this.dboutputbytes = dboutputbytes;
        }

        public String getIsga() {
                return isga;
        }

        public void setIsga(String isga) {
                this.isga = isga;
        }

        public String getIsvalidrun() {
                return isvalidrun;
        }

        public void setIsvalidrun(String isvalidrun) {
                this.isvalidrun = isvalidrun;
        }

        public String getIspristinerun() {
                return ispristinerun;
        }

        public void setIspristinerun(String ispristinerun) {
                this.ispristinerun = ispristinerun;
        }

        public String getTeamemail() {
                return teamemail;
        }

        public void setTeamemail(String teamemail) {
                this.teamemail = teamemail;
        }

        public String getPristinebuildnumber() {
                return pristinebuildnumber;
        }

        public void setPristinebuildnumber(String pristinebuildnumber) {
                this.pristinebuildnumber = pristinebuildnumber;
        }

        public String getValidationjobId() {
                return validationjobId;
        }

        public void setValidationjobId(String validationjobId) {
                this.validationjobId = validationjobId;
        }

        public BigDecimal getGctotalevents() {
                return gctotalevents;
        }

        public void setGctotalevents(BigDecimal gctotalevents) {
                this.gctotalevents = gctotalevents;
        }

        public BigDecimal getGctotalmajor() {
                return gctotalmajor;
        }

        public void setGctotalmajor(BigDecimal gctotalmajor) {
                this.gctotalmajor = gctotalmajor;
        }

        public BigDecimal getGctotalminor() {
                return gctotalminor;
        }

        public void setGctotalminor(BigDecimal gctotalminor) {
                this.gctotalminor = gctotalminor;
        }

        public BigDecimal getGctotalother() {
                return gctotalother;
        }

        public void setGctotalother(BigDecimal gctotalother) {
                this.gctotalother = gctotalother;
        }

        public BigDecimal getGctotalduration() {
                return gctotalduration;
        }

        public void setGctotalduration(BigDecimal gctotalduration) {
                this.gctotalduration = gctotalduration;
        }

        public BigDecimal getGctotalgarbage() {
                return gctotalgarbage;
        }

        public void setGctotalgarbage(BigDecimal gctotalgarbage) {
                this.gctotalgarbage = gctotalgarbage;
        }

        public BigDecimal getGctotalprecollection() {
                return gctotalprecollection;
        }

        public void setGctotalprecollection(BigDecimal gctotalprecollection) {
                this.gctotalprecollection = gctotalprecollection;
        }

        public BigDecimal getGcmaxduration() {
                return gcmaxduration;
        }

        public void setGcmaxduration(BigDecimal gcmaxduration) {
                this.gcmaxduration = gcmaxduration;
        }

        public BigDecimal getGcmaxgarbage() {
                return gcmaxgarbage;
        }

        public void setGcmaxgarbage(BigDecimal gcmaxgarbage) {
                this.gcmaxgarbage = gcmaxgarbage;
        }

        public BigDecimal getGctotalpostcollection() {
                return gctotalpostcollection;
        }

        public void setGctotalpostcollection(BigDecimal gctotalpostcollection) {
                this.gctotalpostcollection = gctotalpostcollection;
        }

        public BigDecimal getGcmaxpostcollection() {
                return gcmaxpostcollection;
        }

        public void setGcmaxpostcollection(BigDecimal gcmaxpostcollection) {
                this.gcmaxpostcollection = gcmaxpostcollection;
        }

        public BigDecimal getGcmaxprecollection() {
                return gcmaxprecollection;
        }

        public void setGcmaxprecollection(BigDecimal gcmaxprecollection) {
                this.gcmaxprecollection = gcmaxprecollection;
        }

        public String getTeamname() {
                return teamname;
        }

        public void setTeamname(String teamname) {
                this.teamname = teamname;
        }

        public BigDecimal getLoadedclasscount() {
                return loadedclasscount;
        }

        public void setLoadedclasscount(BigDecimal loadedclasscount) {
                this.loadedclasscount = loadedclasscount;
        }

        public BigDecimal getActivationdatatimeelapsed() {
                return activationdatatimeelapsed;
        }

        public void setActivationdatatimeelapsed(BigDecimal activationdatatimeelapsed) {
                this.activationdatatimeelapsed = activationdatatimeelapsed;
        }

        public BigDecimal getCommitelapsed() {
                return commitelapsed;
        }

        public void setCommitelapsed(BigDecimal commitelapsed) {
                this.commitelapsed = commitelapsed;
        }

        public BigDecimal getDeclarativerulesinvokedcount() {
                return declarativerulesinvokedcount;
        }

        public void setDeclarativerulesinvokedcount(BigDecimal declarativerulesinvokedcount) {
                this.declarativerulesinvokedcount = declarativerulesinvokedcount;
        }

        public BigDecimal getDeclarativerulesinvokedcpu() {
                return declarativerulesinvokedcpu;
        }

        public void setDeclarativerulesinvokedcpu(BigDecimal declarativerulesinvokedcpu) {
                this.declarativerulesinvokedcpu = declarativerulesinvokedcpu;
        }

        public BigDecimal getDeclarativeruleslookupcpu() {
                return declarativeruleslookupcpu;
        }

        public void setDeclarativeruleslookupcpu(BigDecimal declarativeruleslookupcpu) {
                this.declarativeruleslookupcpu = declarativeruleslookupcpu;
        }

        public BigDecimal getDeclexprctxfreeusecount() {
                return declexprctxfreeusecount;
        }

        public void setDeclexprctxfreeusecount(BigDecimal declexprctxfreeusecount) {
                this.declexprctxfreeusecount = declexprctxfreeusecount;
        }

        public BigDecimal getDeclntwksbuildconstcpu() {
                return declntwksbuildconstcpu;
        }

        public void setDeclntwksbuildconstcpu(BigDecimal declntwksbuildconstcpu) {
                this.declntwksbuildconstcpu = declntwksbuildconstcpu;
        }

        public BigDecimal getDeclntwksbuildconstelapsed() {
                return declntwksbuildconstelapsed;
        }

        public void setDeclntwksbuildconstelapsed(BigDecimal declntwksbuildconstelapsed) {
                this.declntwksbuildconstelapsed = declntwksbuildconstelapsed;
        }

        public BigDecimal getDeclntwksbuildhlcpu() {
                return declntwksbuildhlcpu;
        }

        public void setDeclntwksbuildhlcpu(BigDecimal declntwksbuildhlcpu) {
                this.declntwksbuildhlcpu = declntwksbuildhlcpu;
        }

        public BigDecimal getDeclntwksbuildhlelap() {
                return declntwksbuildhlelap;
        }

        public void setDeclntwksbuildhlelap(BigDecimal declntwksbuildhlelap) {
                this.declntwksbuildhlelap = declntwksbuildhlelap;
        }

        public BigDecimal getDeclrulesinvokedelapsed() {
                return declrulesinvokedelapsed;
        }

        public void setDeclrulesinvokedelapsed(BigDecimal declrulesinvokedelapsed) {
                this.declrulesinvokedelapsed = declrulesinvokedelapsed;
        }

        public BigDecimal getDeclruleslookupelapsed() {
                return declruleslookupelapsed;
        }

        public void setDeclruleslookupelapsed(BigDecimal declruleslookupelapsed) {
                this.declruleslookupelapsed = declruleslookupelapsed;
        }

        public BigDecimal getIndexcount() {
                return indexcount;
        }

        public void setIndexcount(BigDecimal indexcount) {
                this.indexcount = indexcount;
        }

        public BigDecimal getInfergeneratedjavacountcpu() {
                return infergeneratedjavacountcpu;
        }

        public void setInfergeneratedjavacountcpu(BigDecimal infergeneratedjavacountcpu) {
                this.infergeneratedjavacountcpu = infergeneratedjavacountcpu;
        }

        public BigDecimal getInteractions() {
                return interactions;
        }

        public void setInteractions(BigDecimal interactions) {
                this.interactions = interactions;
        }

        public BigDecimal getJavaassemblecpu() {
                return javaassemblecpu;
        }

        public void setJavaassemblecpu(BigDecimal javaassemblecpu) {
                this.javaassemblecpu = javaassemblecpu;
        }

        public BigDecimal getJavaassembleelapsed() {
                return javaassembleelapsed;
        }

        public void setJavaassembleelapsed(BigDecimal javaassembleelapsed) {
                this.javaassembleelapsed = javaassembleelapsed;
        }

        public BigDecimal getJavacompilecpu() {
                return javacompilecpu;
        }

        public void setJavacompilecpu(BigDecimal javacompilecpu) {
                this.javacompilecpu = javacompilecpu;
        }

        public BigDecimal getJavacompileelapsed() {
                return javacompileelapsed;
        }

        public void setJavacompileelapsed(BigDecimal javacompileelapsed) {
                this.javacompileelapsed = javacompileelapsed;
        }

        public BigDecimal getJavageneratecpu() {
                return javageneratecpu;
        }

        public void setJavageneratecpu(BigDecimal javageneratecpu) {
                this.javageneratecpu = javageneratecpu;
        }

        public BigDecimal getJavagenerateelapsed() {
                return javagenerateelapsed;
        }

        public void setJavagenerateelapsed(BigDecimal javagenerateelapsed) {
                this.javagenerateelapsed = javagenerateelapsed;
        }

        public BigDecimal getLegacyruleapiusedcount() {
                return legacyruleapiusedcount;
        }

        public void setLegacyruleapiusedcount(BigDecimal legacyruleapiusedcount) {
                this.legacyruleapiusedcount = legacyruleapiusedcount;
        }

        public BigDecimal getListrowwithunfilteredstrmcnt() {
                return listrowwithunfilteredstrmcnt;
        }

        public void setListrowwithunfilteredstrmcnt(BigDecimal listrowwithunfilteredstrmcnt) {
                this.listrowwithunfilteredstrmcnt = listrowwithunfilteredstrmcnt;
        }

        public BigDecimal getListwithunfilteredstrmcnt() {
                return listwithunfilteredstrmcnt;
        }

        public void setListwithunfilteredstrmcnt(BigDecimal listwithunfilteredstrmcnt) {
                this.listwithunfilteredstrmcnt = listwithunfilteredstrmcnt;
        }

        public BigDecimal getLookuplistdbfetches() {
                return lookuplistdbfetches;
        }

        public void setLookuplistdbfetches(BigDecimal lookuplistdbfetches) {
                this.lookuplistdbfetches = lookuplistdbfetches;
        }

        public BigDecimal getOtherbrowsecpu() {
                return otherbrowsecpu;
        }

        public void setOtherbrowsecpu(BigDecimal otherbrowsecpu) {
                this.otherbrowsecpu = otherbrowsecpu;
        }

        public BigDecimal getOtherbrowseelapsed() {
                return otherbrowseelapsed;
        }

        public void setOtherbrowseelapsed(BigDecimal otherbrowseelapsed) {
                this.otherbrowseelapsed = otherbrowseelapsed;
        }

        public BigDecimal getOthercount() {
                return othercount;
        }

        public void setOthercount(BigDecimal othercount) {
                this.othercount = othercount;
        }

        public BigDecimal getOtherfromcachecount() {
                return otherfromcachecount;
        }

        public void setOtherfromcachecount(BigDecimal otherfromcachecount) {
                this.otherfromcachecount = otherfromcachecount;
        }

        public BigDecimal getProceduralrulereadcount() {
                return proceduralrulereadcount;
        }

        public void setProceduralrulereadcount(BigDecimal proceduralrulereadcount) {
                this.proceduralrulereadcount = proceduralrulereadcount;
        }

        public BigDecimal getRdbrowwithoutstreamcount() {
                return rdbrowwithoutstreamcount;
        }

        public void setRdbrowwithoutstreamcount(BigDecimal rdbrowwithoutstreamcount) {
                this.rdbrowwithoutstreamcount = rdbrowwithoutstreamcount;
        }

        public BigDecimal getRdbwithoutstreamcount() {
                return rdbwithoutstreamcount;
        }

        public void setRdbwithoutstreamcount(BigDecimal rdbwithoutstreamcount) {
                this.rdbwithoutstreamcount = rdbwithoutstreamcount;
        }

        public BigDecimal getRulebrowsecpu() {
                return rulebrowsecpu;
        }

        public void setRulebrowsecpu(BigDecimal rulebrowsecpu) {
                this.rulebrowsecpu = rulebrowsecpu;
        }

        public BigDecimal getRulebrowseelapsed() {
                return rulebrowseelapsed;
        }

        public void setRulebrowseelapsed(BigDecimal rulebrowseelapsed) {
                this.rulebrowseelapsed = rulebrowseelapsed;
        }

        public BigDecimal getRulecpu() {
                return rulecpu;
        }

        public void setRulecpu(BigDecimal rulecpu) {
                this.rulecpu = rulecpu;
        }

        public BigDecimal getRunmodelcount() {
                return runmodelcount;
        }

        public void setRunmodelcount(BigDecimal runmodelcount) {
                this.runmodelcount = runmodelcount;
        }

        public BigDecimal getRunstreamcount() {
                return runstreamcount;
        }

        public void setRunstreamcount(BigDecimal runstreamcount) {
                this.runstreamcount = runstreamcount;
        }

        public BigDecimal getPeakthreadcount() {
                return peakthreadcount;
        }

        public void setPeakthreadcount(BigDecimal peakthreadcount) {
                this.peakthreadcount = peakthreadcount;
        }

        public BigDecimal getThreadcount() {
                return threadcount;
        }

        public void setThreadcount(BigDecimal threadcount) {
                this.threadcount = threadcount;
        }

        public BigDecimal getTotalloadedclasscount() {
                return totalloadedclasscount;
        }

        public void setTotalloadedclasscount(BigDecimal totalloadedclasscount) {
                this.totalloadedclasscount = totalloadedclasscount;
        }

        public BigDecimal getUnloadedclasscount() {
                return unloadedclasscount;
        }

        public void setUnloadedclasscount(BigDecimal unloadedclasscount) {
                this.unloadedclasscount = unloadedclasscount;
        }

        public BigDecimal getTotalstartedthreadcount() {
                return totalstartedthreadcount;
        }

        public void setTotalstartedthreadcount(BigDecimal totalstartedthreadcount) {
                this.totalstartedthreadcount = totalstartedthreadcount;
        }

        public BigDecimal getInfergeneratedjavacpu() {
                return infergeneratedjavacpu;
        }

        public void setInfergeneratedjavacpu(BigDecimal infergeneratedjavacpu) {
                this.infergeneratedjavacpu = infergeneratedjavacpu;
        }

        public String getTestmode() {
                return testmode;
        }

        public void setTestmode(String testmode) {
                this.testmode = testmode;
        }

        public String getCommitid() {
                return commitid;
        }

        public void setCommitid(String commitid) {
                this.commitid = commitid;
        }

        public String getMprid() {
                return mprid;
        }

        public void setMprid(String mprid) {
                this.mprid = mprid;
        }

        public String getTestrunstatus() {
                return testrunstatus;
        }

        public void setTestrunstatus(String testrunstatus) {
                this.testrunstatus = testrunstatus;
        }
}
