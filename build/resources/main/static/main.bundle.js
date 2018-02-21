webpackJsonp(["main"],{

/***/ "../../../../../src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "#idNav {\r\n    background-color:rgb(26, 90, 145) !important;\r\n}\r\n\r\n.nav-item{\r\n    color:rgb(212, 241, 255) !important;\r\n}\r\n\r\nimg {\r\n    max-width: 100%;\r\n    max-height: 100%;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse\" id=\"idNav\">\r\n<!--    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\"\r\n            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n        <span class=\"navbar-toggler-icon\"></span>\r\n    </button>-->\r\n\r\n    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n        <ul class=\"navbar-nav mr-auto\">\r\n            <a class=\"navbar-brand\" >ClimApp</a>\r\n            <li *ngIf=\"isLoggedIn()\" class=\"nav-item\">\r\n                <a class=\"nav-link\" *ngIf=\"!isLoggedIn()\" routerLinkActive=\"/\" routerLink=\"/\">Home</a>\r\n            </li>\r\n            <li  class=\"nav-item\">\r\n                <a class=\"nav-link\" *ngIf=\"isLoggedIn()\" routerLinkActive=\"/profile\" routerLink=\"/profile\">Profile</a>\r\n            </li>\r\n            <li *ngIf=\"isLoggedIn()\" class=\"nav-item\">\r\n                <a class=\"nav-link\">Zones</a>\r\n            </li>\r\n        </ul>\r\n        <ul  class=\"nav navbar-nav navbar-right\">\r\n            <li *ngIf=\"isLoggedIn()\" class=\"nav-item\">\r\n                <a href=\"#\" class=\"nav-link\" (click)=\"signOut()\">(Sign Out)</a>\r\n            </li>\r\n        </ul>\r\n    </div>\r\n</nav>\r\n\r\n\r\n\r\n\r\n\r\n<div class=\"container\">\r\n    <router-outlet></router-outlet>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__common_auth_service__ = __webpack_require__("../../../../../src/app/common/auth.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var AppComponent = /** @class */ (function () {
    function AppComponent(authService, router) {
        this.authService = authService;
        this.router = router;
        this.title = 'app';
        if (!this.authService.isLoggedIn()) {
            this.router.navigate(['/']);
        }
    }
    AppComponent.prototype.isLoggedIn = function () {
        return this.authService.isLoggedIn();
    };
    AppComponent.prototype.signOut = function () {
        this.authService.signOut();
    };
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("../../../../../src/app/app.component.html"),
            styles: [__webpack_require__("../../../../../src/app/app.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__common_auth_service__["a" /* AuthService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("../../../platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__ng_bootstrap_ng_bootstrap__ = __webpack_require__("../../../../@ng-bootstrap/ng-bootstrap/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__pages_register_page_register_page_component__ = __webpack_require__("../../../../../src/app/pages/register-page/register-page.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__pages_login_page_login_page_component__ = __webpack_require__("../../../../../src/app/pages/login-page/login-page.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__pages_home_page_home_page_component__ = __webpack_require__("../../../../../src/app/pages/home-page/home-page.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__pages_profile_config_page_profile_config_page_component__ = __webpack_require__("../../../../../src/app/pages/profile-config-page/profile-config-page.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__services_user_service__ = __webpack_require__("../../../../../src/app/services/user.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__services_report_service__ = __webpack_require__("../../../../../src/app/services/report.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__common_config_app_configuration_service__ = __webpack_require__("../../../../../src/app/common/config/app-configuration.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__common_config_initial_config__ = __webpack_require__("../../../../../src/app/common/config/initial-config.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__common_app_data_service__ = __webpack_require__("../../../../../src/app/common/app-data.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__common_api_service__ = __webpack_require__("../../../../../src/app/common/api.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__common_auth_service__ = __webpack_require__("../../../../../src/app/common/auth.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};


















var ROUTES = [
    { path: '', component: __WEBPACK_IMPORTED_MODULE_8__pages_home_page_home_page_component__["a" /* HomePageComponent */] },
    { path: 'login', component: __WEBPACK_IMPORTED_MODULE_7__pages_login_page_login_page_component__["a" /* LoginPageComponent */] },
    { path: 'register', component: __WEBPACK_IMPORTED_MODULE_6__pages_register_page_register_page_component__["a" /* RegisterPageComponent */] },
    { path: 'profile', component: __WEBPACK_IMPORTED_MODULE_9__pages_profile_config_page_profile_config_page_component__["a" /* ProfileConfigPageComponent */], canActivate: [__WEBPACK_IMPORTED_MODULE_17__common_auth_service__["a" /* AuthService */]] },
];
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["J" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_8__pages_home_page_home_page_component__["a" /* HomePageComponent */],
                __WEBPACK_IMPORTED_MODULE_7__pages_login_page_login_page_component__["a" /* LoginPageComponent */],
                __WEBPACK_IMPORTED_MODULE_6__pages_register_page_register_page_component__["a" /* RegisterPageComponent */],
                __WEBPACK_IMPORTED_MODULE_9__pages_profile_config_page_profile_config_page_component__["a" /* ProfileConfigPageComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__ng_bootstrap_ng_bootstrap__["a" /* NgbModule */].forRoot(),
                __WEBPACK_IMPORTED_MODULE_4__angular_forms__["e" /* ReactiveFormsModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_router__["b" /* RouterModule */].forRoot(ROUTES),
                __WEBPACK_IMPORTED_MODULE_14__angular_http__["c" /* HttpModule */]
            ],
            providers: [
                {
                    provide: __WEBPACK_IMPORTED_MODULE_13__common_config_initial_config__["a" /* INITIAL_CONFIG */],
                    useValue: {
                        apiURL: 'http://localhost:8080'
                    }
                },
                __WEBPACK_IMPORTED_MODULE_10__services_user_service__["a" /* UserService */],
                __WEBPACK_IMPORTED_MODULE_11__services_report_service__["a" /* ReportService */],
                __WEBPACK_IMPORTED_MODULE_12__common_config_app_configuration_service__["a" /* AppConfiguration */],
                __WEBPACK_IMPORTED_MODULE_15__common_app_data_service__["a" /* AppDataService */],
                __WEBPACK_IMPORTED_MODULE_16__common_api_service__["a" /* APIService */],
                __WEBPACK_IMPORTED_MODULE_17__common_auth_service__["a" /* AuthService */]
            ],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "../../../../../src/app/common/api.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return APIService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__common_config_app_configuration_service__ = __webpack_require__("../../../../../src/app/common/config/app-configuration.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__common_auth_service__ = __webpack_require__("../../../../../src/app/common/auth.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_Observable__ = __webpack_require__("../../../../rxjs/_esm5/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_rxjs_add_operator_catch__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/catch.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_rxjs_add_observable_throw__ = __webpack_require__("../../../../rxjs/_esm5/add/observable/throw.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var APIService = /** @class */ (function () {
    function APIService(config, authService, http) {
        this.config = config;
        this.authService = authService;
        this.http = http;
    }
    APIService.prototype.post = function (url, body, options) {
        return this.http
            .post(this.config.apiURL + "/" + url, body, this.getRequestOptions(options))
            .map(this.extractData)
            .catch(this.handleError);
    };
    APIService.prototype.get = function (url, options) {
        return this.http
            .get(this.config.apiURL + "/" + url, this.getRequestOptions(options))
            .map(this.extractData)
            .catch(this.handleError);
    };
    APIService.prototype.getRequestOptions = function (options) {
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        var innerOptions = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* RequestOptions */]({ headers: headers });
        if (!options || options.credentials === undefined || options.credentials === true) {
            headers.append('Authorization', 'Bearer ' + this.authService.accessToken);
        }
        return innerOptions;
    };
    APIService.prototype.extractData = function (res) {
        return res.json();
    };
    APIService.prototype.handleError = function (error) {
        var errObj;
        if (error instanceof __WEBPACK_IMPORTED_MODULE_1__angular_http__["e" /* Response */]) {
            var body = error.json();
            errObj = body;
        }
        else {
            errObj = error.message ? { message: error.message } : { message: error };
        }
        return __WEBPACK_IMPORTED_MODULE_4_rxjs_Observable__["a" /* Observable */].throw(errObj);
    };
    APIService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__common_config_app_configuration_service__["a" /* AppConfiguration */],
            __WEBPACK_IMPORTED_MODULE_3__common_auth_service__["a" /* AuthService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]])
    ], APIService);
    return APIService;
}());



/***/ }),

/***/ "../../../../../src/app/common/app-data.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppDataService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var AppDataService = /** @class */ (function () {
    function AppDataService() {
        this._accessToken = null;
    }
    Object.defineProperty(AppDataService.prototype, "accessToken", {
        get: function () {
            if (!this._accessToken) {
                this._accessToken = localStorage.getItem('AT');
            }
            return this._accessToken;
        },
        set: function (accessToken) {
            this._accessToken = accessToken;
            localStorage.setItem('AT', accessToken);
        },
        enumerable: true,
        configurable: true
    });
    AppDataService.prototype.removeAccessToken = function () {
        this._accessToken = null;
        localStorage.removeItem('AT');
    };
    AppDataService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [])
    ], AppDataService);
    return AppDataService;
}());



/***/ }),

/***/ "../../../../../src/app/common/auth.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AuthService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__common_app_data_service__ = __webpack_require__("../../../../../src/app/common/app-data.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var AuthService = /** @class */ (function () {
    function AuthService(router, appData) {
        this.router = router;
        this.appData = appData;
    }
    Object.defineProperty(AuthService.prototype, "accessToken", {
        get: function () {
            return this.appData.accessToken;
        },
        set: function (accessToken) {
            this.appData.accessToken = accessToken;
        },
        enumerable: true,
        configurable: true
    });
    AuthService.prototype.isLoggedIn = function () {
        return this.appData.accessToken != null && this.appData.accessToken !== undefined;
    };
    AuthService.prototype.signOut = function () {
        this.appData.removeAccessToken();
        this.router.navigate(['']);
    };
    AuthService.prototype.canActivate = function () {
        if (!this.isLoggedIn()) {
            this.router.navigate(['']);
            return false;
        }
        return true;
    };
    AuthService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */], __WEBPACK_IMPORTED_MODULE_2__common_app_data_service__["a" /* AppDataService */]])
    ], AuthService);
    return AuthService;
}());



/***/ }),

/***/ "../../../../../src/app/common/config/app-configuration.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppConfiguration; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__initial_config__ = __webpack_require__("../../../../../src/app/common/config/initial-config.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};


var AppConfiguration = /** @class */ (function () {
    function AppConfiguration(initialConfig) {
        this.config = initialConfig;
    }
    Object.defineProperty(AppConfiguration.prototype, "apiURL", {
        get: function () {
            return this.config && this.config.apiURL;
        },
        enumerable: true,
        configurable: true
    });
    AppConfiguration = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __param(0, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Inject */])(__WEBPACK_IMPORTED_MODULE_1__initial_config__["a" /* INITIAL_CONFIG */])),
        __metadata("design:paramtypes", [Object])
    ], AppConfiguration);
    return AppConfiguration;
}());



/***/ }),

/***/ "../../../../../src/app/common/config/initial-config.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return INITIAL_CONFIG; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");

var INITIAL_CONFIG = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* InjectionToken */]('app.config');


/***/ }),

/***/ "../../../../../src/app/pages/home-page/home-page.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "img {\r\n    max-width: 50%;\r\n    max-height: 50%;\r\n    height: 50%;\r\n    width: 25% !important;\r\n}\r\n\r\n.center {\r\n    margin-left: auto;\r\n    margin-right: auto;\r\n    display: block;\r\n}\r\n\r\n.btnInit{\r\n    width: 30%;\r\n    height: 110%;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/pages/home-page/home-page.component.html":
/***/ (function(module, exports) {

module.exports = "\r\n<div class=\"container\" id=\"fondo\">\r\n    <img class=\"img-responsive center\" src=\"http://ecofundacioncolombia.org/images/Logoo.png\" alt=\"Logo\"> \r\n        <br>\r\n        <button type=\"button\" class=\"btn btn-info btn-block btnInit center\" (click)=\"routeToSignIn()\">Sing In</button>\r\n        <br>\r\n        <button type=\"button\" class=\"btn btn-info btn-block btnInit center\" (click)=\"routeToSignUp()\">Sing Up</button>\r\n</div>\r\n\r\n\r\n"

/***/ }),

/***/ "../../../../../src/app/pages/home-page/home-page.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HomePageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var HomePageComponent = /** @class */ (function () {
    function HomePageComponent(router) {
        this.router = router;
    }
    HomePageComponent.prototype.ngOnInit = function () {
    };
    HomePageComponent.prototype.routeToSignUp = function () {
        this.router.navigate(['/register']);
    };
    HomePageComponent.prototype.routeToSignIn = function () {
        this.router.navigate(['/login']);
    };
    HomePageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-home-page',
            template: __webpack_require__("../../../../../src/app/pages/home-page/home-page.component.html"),
            styles: [__webpack_require__("../../../../../src/app/pages/home-page/home-page.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], HomePageComponent);
    return HomePageComponent;
}());



/***/ }),

/***/ "../../../../../src/app/pages/login-page/login-page.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".btnInit{\r\n    width: 30%;\r\n    height: 10%;\r\n}\r\n\r\n.center {\r\n    margin-left: auto;\r\n    margin-right: auto;\r\n    display: block;\r\n}\r\n\r\n.textField{\r\n    width: 80%;\r\n}\r\n\r\n.label{\r\n    width: 80%;\r\n}\r\n\r\nimg {\r\n    max-width: 100%;\r\n    max-height: 50%;\r\n    height: 50%;\r\n    width: 80% !important;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/pages/login-page/login-page.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n\r\n    <form [formGroup]=\"signInForm\" (ngSubmit)=\"doLogin()\" novalidate>\r\n        <div class=\"row\">\r\n            <div class=\"col-md-3\"><img class=\"img-responsive\" src=\"http://ecofundacioncolombia.org/images/Logoo.png\" alt=\"Logo\"></div>\r\n            <div class=\"col-md-6\">\r\n                <h1 id=\"titulo\" align=\"center\">Sign-In</h1>\r\n                <br><br>\r\n                <div class=\"form-group\" >\r\n                    <label for=\"email\" class=\"center label\">Email</label>\r\n                    <input type=\"email\" class=\"form-control textField center\" id=\"email\" formControlName=\"email\" required=\"\">\r\n                </div>\r\n                <div class=\"form-group\" >\r\n                    <label for=\"password\" class=\"center label\">Password</label>\r\n                    <input type=\"password\" class=\"form-control textField center\" id=\"password\" formControlName=\"password\" required=\"\">\r\n                </div>\r\n                <br>\r\n                <button type=\"submit\" class=\"btn btn-info btn-block btnInit center\" [disabled]=\"!signInForm.valid\">Sign In</button>\r\n                <button type=\"button\" class=\"btn btn-info btn-block btnInit center\" (click)=\"routeToHome()\">Home</button>\r\n                <p class=\"text-danger mt-1\" *ngIf=\"loginError\">{{loginError}}</p>\r\n            </div>\r\n            <div class=\"col-md-3\"></div>\r\n        </div>\r\n    </form>\r\n</div>\r\n\r\n"

/***/ }),

/***/ "../../../../../src/app/pages/login-page/login-page.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoginPageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_user_service__ = __webpack_require__("../../../../../src/app/services/user.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var LoginPageComponent = /** @class */ (function () {
    function LoginPageComponent(formBuilder, router, usersService) {
        this.formBuilder = formBuilder;
        this.router = router;
        this.usersService = usersService;
    }
    LoginPageComponent.prototype.ngOnInit = function () {
        this.signInForm = this.formBuilder.group({
            email: '',
            password: ''
        });
    };
    LoginPageComponent.prototype.routeToHome = function () {
        this.router.navigate(['/']);
    };
    LoginPageComponent.prototype.doLogin = function () {
        var _this = this;
        this.usersService.login(this.signInForm.get('email').value, this.signInForm.get('password').value).subscribe(function (loginResponse) {
            _this.router.navigate(['/profile']);
        }, function (error) {
            _this.loginError = 'Error Signing in: ' + (error && error.message ? error.message : '');
        });
    };
    LoginPageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-login-page',
            template: __webpack_require__("../../../../../src/app/pages/login-page/login-page.component.html"),
            styles: [__webpack_require__("../../../../../src/app/pages/login-page/login-page.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormBuilder */], __WEBPACK_IMPORTED_MODULE_3__angular_router__["a" /* Router */], __WEBPACK_IMPORTED_MODULE_1__services_user_service__["a" /* UserService */]])
    ], LoginPageComponent);
    return LoginPageComponent;
}());



/***/ }),

/***/ "../../../../../src/app/pages/profile-config-page/profile-config-page.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "\r\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/pages/profile-config-page/profile-config-page.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"container-fluid\" id=\"\" >\r\n\r\n  <div class=\"row\">\r\n    <div class=\"col-3\">\r\n\r\n      <img width=\"200\" height=\"200\" class=\"img-responsive center\" src=\"http://ecofundacioncolombia.org/images/Logoo.png\" alt=\"Logo\">\r\n\r\n    </div>\r\n    <div class=\"col-6\">\r\n      <h1 id=\"titulo\" align=\"center\">Profile</h1>\r\n      <br>\r\n      <form [formGroup]=\"profileForm\"  novalidate>\r\n        <br>\r\n\r\n        <div class=\"row \" *ngIf=\"!isEditable()\">\r\n\r\n          <div class=\"col justify-content-center\" >\r\n\r\n            <label >Name: </label>\r\n            <p id=\"name2\">{{username}}</p>\r\n\r\n            <label for=\"email2\">Email: </label>\r\n            <p id=\"email2\">{{useremail}}</p>\r\n            <div class=\"row justify-content-end\" >\r\n              <div class=\"col\" >\r\n                <br>\r\n                <button  type=\"submit\" class=\"btn btn-info btn-block btnInit  \" (click)=\"edit()\">Edit profile</button>\r\n              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n        <div *ngIf=\"isEditable()\" class=\"row\">\r\n          <label for=\"name\">Name: </label>\r\n          <input type=\"text\" [(ngModel)]=\"username\" class=\"form-control\" id=\"name\" formControlName=\"name\" required>\r\n\r\n          <label for=\"email\">Email: </label>\r\n          <input  type=\"email\" [(ngModel)]=\"useremail\" class=\"form-control\" id=\"email\" formControlName=\"email\"  required>\r\n\r\n          <label for=\"password\">New password: </label>\r\n          <input   type=\"password\" [(ngModel)]=\"userpass\" class=\"form-control\" id=\"password\" formControlName=\"password\" required>\r\n          <br>\r\n\r\n          <!-- Image file-->\r\n          <!--img id=\"imgn\" width=\"300\" height=\"300\" src=\"https://cdn3.iconfinder.com/data/icons/gray-toolbar-3/512/user-512.png\"  alt=\"ProfilePicture\">\r\n\r\n          <div class=\"custom-file col-9\" >\r\n            <label class=\"custom-file-label \" for=\"img\">Select your picture</label>\r\n            <input class=\"form-control\" formControlName=\"img\" type=\"file\" class=\"custom-file-input\" id=\"img\">\r\n\r\n          </div>\r\n          <div-- class=\"col-3\">\r\n            <button  type=\"submit\" class=\"btn btn-info btn-block btnInit \" (click)=\"saveConfig()\">Save</button>\r\n          </div-->\r\n\r\n\r\n          <label for=\"image\" class=\"center label\">Picture link</label>\r\n          <input type=\"text\" [(ngModel)]=\"userimage\" class=\"form-control textField center\" id=\"image\" formControlName=\"image\">\r\n\r\n\r\n\r\n          <div class=\"col\">\r\n            <button type=\"button\" class=\"btn btn-info btn-block btnInit center \" (click)=\"routeToProfile()\">Profile</button>\r\n\r\n            <button  type=\"submit\"  class=\"btn btn-info btn-block btnInit center \" [disabled]=\"!userForm.valid\" (click)=\"saveConfig()\">Save</button>\r\n            <p class=\"text-danger mt-1\" *ngIf=\"profileError\">{{profileError}}</p>\r\n          </div>\r\n\r\n\r\n        </div>\r\n      </form>\r\n    </div>\r\n    <div *ngIf=\"!isEditable()\" class=\"col-3\">\r\n\r\n        <img class=\"img-responsive\" width=\"300\" height=\"300\"   [src]=\"userimage\"  alt=\"ProfilePicture\">\r\n\r\n    </div>\r\n  </div>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/pages/profile-config-page/profile-config-page.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProfileConfigPageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_user_service__ = __webpack_require__("../../../../../src/app/services/user.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var ProfileConfigPageComponent = /** @class */ (function () {
    function ProfileConfigPageComponent(userService, formBuilder, router) {
        var _this = this;
        this.userService = userService;
        this.formBuilder = formBuilder;
        this.router = router;
        this.userService.getUEmail().subscribe(function (serverResponse) {
            _this.username = serverResponse.name;
            _this.useremail = serverResponse.email;
            _this.userimage = serverResponse.image;
            _this.userpass = serverResponse.password;
        });
    }
    ProfileConfigPageComponent.prototype.ngOnInit = function () {
        this.profileForm = this.formBuilder.group({
            name: '',
            email: '',
            image: '',
            password: '',
        });
    };
    ProfileConfigPageComponent.prototype.isEditable = function () {
        return this.editable;
    };
    ProfileConfigPageComponent.prototype.routeToProfile = function () {
        this.editable = false;
        this.router.navigate(['/profile']);
    };
    ProfileConfigPageComponent.prototype.saveConfig = function () {
        var _this = this;
        this.userService.updateUser(this.profileForm.get('name').value, this.profileForm.get('email').value, this.profileForm.get('image').value, this.profileForm.get('password').value).subscribe(function (serverResponse) {
            _this.userService.emailuser = _this.profileForm.get('email').value;
        }, function (error) {
            _this.profileError = (error && error.message ? error.message : '');
        });
    };
    ProfileConfigPageComponent.prototype.edit = function () {
        this.editable = true;
    };
    ProfileConfigPageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-profile-config-page',
            template: __webpack_require__("../../../../../src/app/pages/profile-config-page/profile-config-page.component.html"),
            styles: [__webpack_require__("../../../../../src/app/pages/profile-config-page/profile-config-page.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__services_user_service__["a" /* UserService */], __WEBPACK_IMPORTED_MODULE_3__angular_forms__["a" /* FormBuilder */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], ProfileConfigPageComponent);
    return ProfileConfigPageComponent;
}());



/***/ }),

/***/ "../../../../../src/app/pages/register-page/register-page.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".btnInit{\r\n    width: 30%;\r\n    height: 8%;\r\n}\r\n\r\n.center {\r\n    margin-left: auto;\r\n    margin-right: auto;\r\n    display: block;\r\n}\r\n\r\n.textField{\r\n    width: 80%;\r\n}\r\n\r\n.label{\r\n    width: 80%;\r\n}\r\n\r\nimg {\r\n    max-width: 100%;\r\n    max-height: 50%;\r\n    height: 50%;\r\n    width: 100% !important;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/pages/register-page/register-page.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n\r\n    <form [formGroup]=\"userForm\" (ngSubmit)=\"onSubmit()\" novalidate>\r\n\r\n        <div class=\"row\">\r\n            <div class=\"col-md-3\"><img class=\"img-responsive\" src=\"http://ecofundacioncolombia.org/images/Logoo.png\" alt=\"Logo\"></div>\r\n            <div class=\"col-md-6\">\r\n                <h1 id=\"titulo\" align=\"center\">Sign-Up</h1>\r\n                <div class=\"form-group\" >\r\n                    <label for=\"name\" class=\"center label\">Name</label>\r\n                    <input type=\"text\" class=\"form-control textField center\" id=\"name\" formControlName=\"name\" required>\r\n                </div>\r\n\r\n                <div class=\"form-group\" >\r\n                    <label for=\"email\" class=\"center label\">Email</label>\r\n                    <input type=\"email\" class=\"form-control textField center\" id=\"email\" formControlName=\"email\" required>\r\n                </div>\r\n\r\n                <div class=\"form-group\" >\r\n                    <label for=\"password\" class=\"center label\">Password</label>\r\n                    <input type=\"password\" class=\"form-control textField center\" id=\"password\" formControlName=\"password\" required>\r\n                </div>\r\n\r\n                <div class=\"form-group\">\r\n                    <label for=\"confirmPassword\" class=\"center label\">Confirm Password</label>\r\n                    <input type=\"password\" class=\"form-control textField center\" id=\"confirmPassword\" formControlName=\"confirmPassword\" required>\r\n                </div>\r\n\r\n                <p class=\"text-danger mt-1\" *ngIf=\"error\">{{error}}</p>\r\n                <button type=\"submit\" class=\"btn btn-info btn-block btnInit center\" [disabled]=\"!userForm.valid\">Register</button>\r\n                <button type=\"button\" class=\"btn btn-info btn-block btnInit center\" (click)=\"routeToHome()\">Home</button>\r\n            </div>\r\n            <div class=\"col-md-3\"><img class=\"img-responsive\" src=\"https://cdn3.iconfinder.com/data/icons/gray-toolbar-3/512/user-512.png\" alt=\"ProfilePicture\">\r\n                <div class=\"form-group\">\r\n                    <label for=\"image\" class=\"center label\">Picture link</label>\r\n                    <input type=\"text\" class=\"form-control textField center\" id=\"image\" formControlName=\"image\">\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </form>\r\n</div>\r\n\r\n"

/***/ }),

/***/ "../../../../../src/app/pages/register-page/register-page.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RegisterPageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_user_service__ = __webpack_require__("../../../../../src/app/services/user.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var RegisterPageComponent = /** @class */ (function () {
    function RegisterPageComponent(userService, formBuilder, router) {
        this.userService = userService;
        this.formBuilder = formBuilder;
        this.router = router;
    }
    RegisterPageComponent.prototype.ngOnInit = function () {
        this.userForm = this.formBuilder.group({
            name: '',
            email: '',
            image: '',
            password: '',
            confirmPassword: ''
        });
    };
    RegisterPageComponent.prototype.routeToHome = function () {
        this.router.navigate(['/']);
    };
    RegisterPageComponent.prototype.onSubmit = function () {
        var _this = this;
        this.userService.registerUser(this.userForm.get('name').value, this.userForm.get('email').value, this.userForm.get('image').value, this.userForm.get('password').value, this.userForm.get('confirmPassword').value).subscribe(function (serverResponse) {
            _this.router.navigate(['/login']);
        }, function (error) {
            _this.error = 'Error Sign-up user in: ' + (error && error.message ? error.message : '');
            console.log(error);
        });
    };
    RegisterPageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-register-page',
            template: __webpack_require__("../../../../../src/app/pages/register-page/register-page.component.html"),
            styles: [__webpack_require__("../../../../../src/app/pages/register-page/register-page.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__services_user_service__["a" /* UserService */], __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormBuilder */], __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */]])
    ], RegisterPageComponent);
    return RegisterPageComponent;
}());



/***/ }),

/***/ "../../../../../src/app/services/report.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ReportService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__common_api_service__ = __webpack_require__("../../../../../src/app/common/api.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__common_config_app_configuration_service__ = __webpack_require__("../../../../../src/app/common/config/app-configuration.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__common_auth_service__ = __webpack_require__("../../../../../src/app/common/auth.service.ts");
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ReportService = /** @class */ (function (_super) {
    __extends(ReportService, _super);
    function ReportService(config, http, authService) {
        var _this = _super.call(this, config, authService, http) || this;
        _this.config = config;
        _this.http = http;
        _this.authService = authService;
        return _this;
    }
    ReportService.prototype.registerReport = function () {
    };
    ReportService.prototype.deleteReport = function () { };
    ReportService.prototype.getReportsByUser = function () {
    };
    ReportService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__common_config_app_configuration_service__["a" /* AppConfiguration */], __WEBPACK_IMPORTED_MODULE_2__angular_http__["b" /* Http */], __WEBPACK_IMPORTED_MODULE_4__common_auth_service__["a" /* AuthService */]])
    ], ReportService);
    return ReportService;
}(__WEBPACK_IMPORTED_MODULE_1__common_api_service__["a" /* APIService */]));



/***/ }),

/***/ "../../../../../src/app/services/user.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return UserService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__common_api_service__ = __webpack_require__("../../../../../src/app/common/api.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_http__ = __webpack_require__("../../../http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__common_config_app_configuration_service__ = __webpack_require__("../../../../../src/app/common/config/app-configuration.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__common_auth_service__ = __webpack_require__("../../../../../src/app/common/auth.service.ts");
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var UserService = /** @class */ (function (_super) {
    __extends(UserService, _super);
    function UserService(config, http, authService) {
        var _this = _super.call(this, config, authService, http) || this;
        _this.config = config;
        _this.http = http;
        _this.authService = authService;
        _this.emailuser = '';
        return _this;
    }
    UserService.prototype.registerUser = function (name, email, image, password, confirmPassword) {
        return this.post('users/', { name: name, email: email, image: image, password: password, confirmPassword: confirmPassword }).map(function (loginResponse) {
            if (loginResponse) {
            }
        });
    };
    UserService.prototype.updateUser = function (name, email, image, password) {
        return this.post('users/updateprofile/' + this.emailuser, { name: name, email: email,
            image: image, password: password, confirmPassword: password }).map(function (updateResponse) {
            if (updateResponse) {
            }
        });
    };
    UserService.prototype.deleteUser = function () { };
    UserService.prototype.getUEmail = function () {
        return this.get('users/' + this.emailuser);
    };
    UserService.prototype.login = function (email, password) {
        var _this = this;
        return this.post('users/login', { email: email, password: password }, { credentials: false }).map(function (loginResponse) {
            if (loginResponse) {
                _this.emailuser = email;
                _this.authService.accessToken = loginResponse.accessToken;
            }
        });
    };
    UserService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__common_config_app_configuration_service__["a" /* AppConfiguration */], __WEBPACK_IMPORTED_MODULE_2__angular_http__["b" /* Http */], __WEBPACK_IMPORTED_MODULE_4__common_auth_service__["a" /* AuthService */]])
    ], UserService);
    return UserService;
}(__WEBPACK_IMPORTED_MODULE_1__common_api_service__["a" /* APIService */]));



/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};


/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map