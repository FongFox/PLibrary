export const oktaConfig = {
    // Thêm thông tin okta
    // clientId: '<CLIENTID HERE>',
    // issuer: 'https://dev-<DEV ID>.okta.com/oauth2/default',
    clientId: '0oadtu7l2xowPDosk5d7',
    issuer: 'https://dev-47183227.okta.com/oauth2/default',
    redirectUri: 'http://localhost:3000/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true,
}