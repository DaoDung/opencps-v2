webpackJsonp([6],{288:function(t,e,s){var a=s(42)(s(301),s(306),null,null);t.exports=a.exports},301:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=s(207);e.default={data:function(){return{}},computed:{loading:function(){return this.$store.getters.loading},thanhPhanHoSo:function(){return this.$store.getters.thanhPhanHoSo},dossierTemplates:function(){return this.$store.getters.dossierTemplates},dossierFiles:function(){return this.$store.getters.dossierFiles}},mounted:function(){var t=this;t.page=1,t.$nextTick(function(){setTimeout(function(e){t.dossierTemplates.forEach(function(e){t.$store.dispatch("loadAlpcaForm",e)})},500)})},methods:{onDeleteAttackFiles:function(t){var e=this;console.log("delete"),e.$root.$confirm.open("Xóa","Bạn có muốn xoá thành phần hồ sơ này?",{color:"red"}).then(function(s){e.$store.dispatch("deleteAttackFiles",t).then(function(s){e.$store.dispatch("resetCounterTemplate",t),e.$store.dispatch("loadDossierFiles"),a.b("success","Xóa thành công")}).catch(function(t){a.b("error","Xóa thất bại")})}).catch(function(t){console.log("kkk")})},pickFile:function(t){document.getElementById("file"+t.partNo).click()},onUploadSingleFile:function(t,e){var s=this;t.dataItem=e,s.$store.dispatch("uploadSingleFile",t).then(function(t){a.b("success","Tải lên thành công"),s.$store.dispatch("loadDossierFiles",e)}).catch(function(t){a.b("error","Tải lên thất bại"),s.$store.dispatch("loadDossierFiles",e)})},loadAlpcaForm:function(t){this.$store.dispatch("loadAlpcaForm",t)},postDossierMark:function(t){this.$store.dispatch("postDossierMark",t)},viewFile:function(t){this.$store.dispatch("viewFile",t)}}}},306:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticStyle:{position:"relative"}},[s("v-expansion-panel",{staticClass:"expansion-pl"},[s("v-expansion-panel-content",{attrs:{"hide-actions":"",value:"1"}},[s("div",{attrs:{slot:"header"},slot:"header"},[s("div",{staticClass:"background-triangle-small"},[t._v(" IV.")]),t._v("\n        THÀNH PHẦN HỒ SƠ      \n       "),t._v(" "),s("div",{staticClass:"absolute-lable"},[s("span",{staticClass:"text-bold"},[t._v("Bản chính")]),t._v(" "),s("span",{staticClass:"text-bold"},[t._v("Bản chụp")]),t._v(" "),s("span",{staticClass:"text-bold"},[t._v("Công chứng")])])]),t._v(" "),s("v-card",[t._l(t.dossierTemplates,function(e,a){return s("div",{key:e.partNo,staticStyle:{position:"relative"}},[s("v-expansion-panel",{staticClass:"expaned__list__data"},[s("v-expansion-panel-content",{attrs:{"hide-actions":"",value:!1}},[s("div",{staticClass:"pl-2 py-1",attrs:{slot:"header"},slot:"header"},[s("div",{staticStyle:{width:"calc(100% - 420px )",display:"flex","align-items":"center","min-height":"38px"}},[s("span",{staticClass:"text-bold mr-2"},[t._v(t._s(a+1)+".")]),t._v(" "),s("span",{on:{click:function(s){t.loadAlpcaForm(e)}}},[t._v(t._s(e.partName)+" "),e.required?s("span",{staticStyle:{color:"red"}},[t._v(" (*)")]):t._e(),t._v(" "),e.hasForm?s("i",[t._v("Form trực tuyến")]):t._e()])])]),t._v(" "),s("v-card",[s("v-card-text",[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{staticClass:"text-xs-right",attrs:{xs12:""}},[s("div",{attrs:{id:"formAlpaca"+e.partNo}})])],1)],1)],1)],1)],1),t._v(" "),s("div",{staticClass:"absolute__btn group__thanh_phan px-2 py-1"},[t.loading?s("content-placeholders",{staticClass:"mt-1"},[s("content-placeholders-text",{attrs:{lines:1}})],1):s("v-layout",{staticClass:"flex__checkbox",attrs:{row:"",wrap:""}},[s("v-flex",{staticClass:"layout wrap",staticStyle:{width:"300px"}},[s("v-checkbox",{staticClass:"flex",attrs:{light:"",color:"secondary"},model:{value:t.thanhPhanHoSo.dossierTemplates[a].fileCheck,callback:function(e){t.$set(t.thanhPhanHoSo.dossierTemplates[a],"fileCheck",e)},expression:"thanhPhanHoSo.dossierTemplates[index].fileCheck"}}),t._v(" "),s("v-radio-group",{staticClass:"flex__checkbox",attrs:{row:""},model:{value:t.thanhPhanHoSo.dossierTemplates[a].fileType,callback:function(e){t.$set(t.thanhPhanHoSo.dossierTemplates[a],"fileType",e)},expression:"thanhPhanHoSo.dossierTemplates[index].fileType"}},[s("v-radio",{attrs:{value:2,disabled:!t.thanhPhanHoSo.dossierTemplates[a].fileCheck}}),t._v(" "),s("v-radio",{attrs:{value:0,disabled:!t.thanhPhanHoSo.dossierTemplates[a].fileCheck}}),t._v(" "),s("v-radio",{attrs:{value:1,disabled:!t.thanhPhanHoSo.dossierTemplates[a].fileCheck}})],1)],1),t._v(" "),s("v-flex",{staticClass:"text-right",staticStyle:{width:"120px"}},[s("v-tooltip",{attrs:{top:""}},[s("v-btn",{staticClass:"mx-0 my-0",attrs:{slot:"activator",icon:""},slot:"activator"},[s("v-badge",[s("input",{staticStyle:{display:"none"},attrs:{type:"file",id:"file"+e.partNo},on:{change:function(s){t.onUploadSingleFile(s,e)}}}),t._v(" "),s("v-icon",{attrs:{size:"20",color:"primary"},on:{click:function(s){t.pickFile(e)}}},[t._v("attach_file")])],1)],1),t._v(" "),s("span",[t._v("Tải file lên")])],1),t._v(" "),s("v-tooltip",{attrs:{top:""}},[s("v-btn",{staticClass:"mx-0",staticStyle:{height:"25px",width:"25px"},attrs:{slot:"activator",fab:"",dark:"",small:"",color:"primary"},on:{click:function(s){t.viewFile(e)}},slot:"activator"},[t._v("\n                    "+t._s(e.count)+"\n                  ")]),t._v(" "),s("span",[t._v("Xem")])],1),t._v(" "),s("v-tooltip",{attrs:{top:""}},[s("v-btn",{staticClass:"mx-0 my-0",attrs:{slot:"activator",icon:""},on:{click:function(s){t.onDeleteAttackFiles(e)}},slot:"activator"},[s("v-icon",{staticClass:"mx-0",attrs:{size:"18",color:"red darken-3"}},[t._v("delete")])],1),t._v(" "),s("span",[t._v("Xóa")])],1)],1)],1)],1)],1)}),t._v(" "),s("v-card-text",[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?s("content-placeholders",{staticClass:"mt-1"},[s("content-placeholders-text",{attrs:{lines:1}})],1):s("v-subheader",{staticClass:"pl-0 text-right"},[t._v("Ghi chú: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm10:""}},[t.loading?s("content-placeholders",{staticClass:"mt-1"},[s("content-placeholders-text",{attrs:{lines:1}})],1):s("v-text-field",{attrs:{"multi-line":"",rows:"2"},model:{value:t.thanhPhanHoSo.ghiChuThanhPhan,callback:function(e){t.$set(t.thanhPhanHoSo,"ghiChuThanhPhan",e)},expression:"thanhPhanHoSo.ghiChuThanhPhan"}})],1)],1)],1)],2)],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=6.1ad9454c917174f8deec.js.map