// // Added by the Spring Security Core plugin:
// grails.plugin.springsecurity.userLookup.userDomainClassName = 'apibe.auth.User'
// grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'apibe.auth.UserRole'
// grails.plugin.springsecurity.authority.className = 'apibe.auth.Role'
// grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//         [pattern: '/', access: ['permitAll']],
//         [pattern: '/error', access: ['permitAll']]
// ]
//
// grails.plugin.springsecurity.filterChain.chainMap = [
//         //Stateless chain, http://alvarosanchez.github.io/grails-spring-security-rest/latest/docs/#_plugin_configuration
//         [pattern: '/api/**', filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter']
// ]
//
//
//
// // Added by the Spring Security Core plugin:
// grails.plugin.springsecurity.userLookup.userDomainClassName = 'apibe.auth.User'
// grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'apibe.auth.UserRole'
// grails.plugin.springsecurity.authority.className = 'apibe.auth.Role'
// grails.plugin.springsecurity.controllerAnnotations.staticRules = [
// 	[pattern: '/',               access: ['permitAll']],
// 	[pattern: '/error',          access: ['permitAll']],
// 	[pattern: '/index',          access: ['permitAll']],
// 	[pattern: '/index.gsp',      access: ['permitAll']],
// 	[pattern: '/shutdown',       access: ['permitAll']],
// 	[pattern: '/assets/**',      access: ['permitAll']],
// 	[pattern: '/**/js/**',       access: ['permitAll']],
// 	[pattern: '/**/css/**',      access: ['permitAll']],
// 	[pattern: '/**/images/**',   access: ['permitAll']],
// 	[pattern: '/**/favicon.ico', access: ['permitAll']]
// ]
//
// grails.plugin.springsecurity.filterChain.chainMap = [
// 	[pattern: '/assets/**',      filters: 'none'],
// 	[pattern: '/**/js/**',       filters: 'none'],
// 	[pattern: '/**/css/**',      filters: 'none'],
// 	[pattern: '/**/images/**',   filters: 'none'],
// 	[pattern: '/**/favicon.ico', filters: 'none'],
// 	[pattern: '/**',             filters: 'JOINED_FILTERS']
// ]
//
//
// // Added by the Spring Security Core plugin:
// grails.plugin.springsecurity.userLookup.userDomainClassName = 'apibe.auth.User'
// grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'apibe.auth.UserRole'
// grails.plugin.springsecurity.authority.className = 'apibe.auth.Role'
// grails.plugin.springsecurity.controllerAnnotations.staticRules = [
// 	[pattern: '/',               access: ['permitAll']],
// 	[pattern: '/error',          access: ['permitAll']],
// 	[pattern: '/index',          access: ['permitAll']],
// 	[pattern: '/index.gsp',      access: ['permitAll']],
// 	[pattern: '/shutdown',       access: ['permitAll']],
// 	[pattern: '/assets/**',      access: ['permitAll']],
// 	[pattern: '/**/js/**',       access: ['permitAll']],
// 	[pattern: '/**/css/**',      access: ['permitAll']],
// 	[pattern: '/**/images/**',   access: ['permitAll']],
// 	[pattern: '/**/favicon.ico', access: ['permitAll']]
// ]
//
// grails.plugin.springsecurity.filterChain.chainMap = [
// 	[pattern: '/assets/**',      filters: 'none'],
// 	[pattern: '/**/js/**',       filters: 'none'],
// 	[pattern: '/**/css/**',      filters: 'none'],
// 	[pattern: '/**/images/**',   filters: 'none'],
// 	[pattern: '/**/favicon.ico', filters: 'none'],
// 	[pattern: '/**',             filters: 'JOINED_FILTERS']
// ]
//
