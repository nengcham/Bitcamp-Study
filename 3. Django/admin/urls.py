from django.contrib import admin

from django.urls import path, include
from admin.views import hello_api
urlpatterns = [
    path('', hello_api),
    path('users/', include('users.url')),
    # path('admin/', admin.site.urls),
]