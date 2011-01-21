/*
Copyright (c) 2003-2010, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function(config) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';

	// config.toolbar = [ [ 'Source', '-', 'Bold', 'Italic', 'syntaxhighlight' ]
	// ];
	//	
	// config.extraPlugins='syntaxhighlight';
	
	config.extraPlugins = 'syntaxhighlight';
	
	config.filebrowserUploadUrl = '../upload/File';
	config.filebrowserImageUploadUrl = '../upload/Image';
	config.filebrowserFlashUploadUrl = '../upload/Flash';
	// 图片浏览配置
	config.filebrowserImageBrowseUrl = '../browse/image';
	
	config.font_defaultLabel = '微软雅黑';
	
	config.fontSize_defaultLabel = '14px';

	config.toolbar = 'SimbloToolBar';

	config.toolbar_SimbloToolBar =
	[
	['Source', 'syntaxhighlight', 'Preview'],
	['Cut','Copy','Paste','PasteText','PasteFromWord'],
	['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
	['Image','Flash','Table','HorizontalRule','Smiley','SpecialChar','PageBreak'],
	'/',
	['Styles','Format'],
	['Bold','Italic','Strike'],
	['NumberedList','BulletedList','-','Outdent','Indent','Blockquote'],
	['Link','Unlink','Anchor'],
	['Maximize']
	];


};

