<div id="popUpViewDossierFileTemplate">
    <div class="layout wrap">
        <div v-if="!popupResultFile" class="flex xs12 sm3 opencps_list_border_style" jx-bind="listDocumentInPartNo" style="overflow: hidden;"> </div>
        <div v-if="popupResultFile" class="flex xs12 sm3 opencps_list_border_style" jx-bind="listDocumentOutStep" style="overflow: hidden;"> </div>
        <div class="flex xs12 sm9 text-center">
            <div>
				<object id="dossierPDFView" data="" width="100%" height="100%" class="hidden">
				</object>
                <div id="dossierPDFViewNotFound" class="text-center"></div>
			</div>
        </div>
    </div>
</div>